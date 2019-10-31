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

    @Autowired
    MessageRepository messageRepository;

    @Override
    public List<MessageDto> getMessages(String author) {
        List<MessageDto> result = new ArrayList<>();

        List<Message> messages = messageRepository.findAll();

        for (Message message : messages) {
            if (author == null || message.getAuthor().equals(author)) {
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
    public void sendMessage(final String message, final String author) {
        Message entity = new Message();
        entity.setMessage(message);
        entity.setCreatedAt(LocalDateTime.now());
        entity.setAuthor(author);
        messageRepository.save(entity);
    }

}
