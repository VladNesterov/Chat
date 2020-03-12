package com.github.vladnesterov.vladchat;

import com.github.vladnesterov.vladchat.dto.MessageDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.annotation.Nullable;

@RestController
public class ChatController {

    @Autowired
    private ChatService chatService;

    @RequestMapping(value = "messages")
    List<MessageDto> getListMessage(@Nullable String author, String targetUser) {
        return chatService.getMessages(author, targetUser);
    }

    @RequestMapping(value = "send")
    void setMessages(String message, @Nullable String author, @Nullable String targetUser) {
        chatService.sendMessage(message, author, targetUser);
    }

}
