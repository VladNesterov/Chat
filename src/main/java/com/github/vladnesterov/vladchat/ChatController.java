package com.github.vladnesterov.vladchat;

import com.github.vladnesterov.vladchat.dto.MessageDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatController {

    @Autowired
    ChatServiceImpl chatService;

    @RequestMapping(value = "messages")
    List<MessageDto> getListMessage(String author) {
        return chatService.getMessages(author);
    }

    @RequestMapping(value = "send")
    void setMessages(String message, String author) {
        chatService.sendMessage(message, author);
    }

}
