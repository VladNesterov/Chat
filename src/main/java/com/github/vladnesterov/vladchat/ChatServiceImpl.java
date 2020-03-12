package com.github.vladnesterov.vladchat;

import com.github.vladnesterov.vladchat.dto.MessageDto;
import com.github.vladnesterov.vladchat.entity.Message;
import com.github.vladnesterov.vladchat.repository.MessageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    private MessageRepository messageRepository;

    @Autowired
    public ChatServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<MessageDto> getMessages(String author, String targetUser) {
        List<MessageDto> result = new ArrayList<>();

        List<Message> messages = messageRepository.findAll();
        for (Message message : messages) {

            boolean authorCorrect = author == null
                    || author.equals(message.getAuthor());
            boolean targetUserCorrect = targetUser == null
                    || targetUser.equals(message.getTargetUser());

            if (authorCorrect && targetUserCorrect) {
                MessageDto messageDto = new MessageDto();
                messageDto.setCreatedAt(message.getCreatedAt());
                messageDto.setMessage(message.getMessage());
                messageDto.setAuthor(message.getAuthor());
                result.add(messageDto);
            }

        }

        return result;
    }

    @Override
    public void sendMessage(final String message, final String author,final String targetUser) {
        Message entity = new Message();
        entity.setMessage(message);
        entity.setCreatedAt(LocalDateTime.now());
        entity.setAuthor(author);
        entity.setTargetUser(targetUser);
        messageRepository.save(entity);
    }

}
