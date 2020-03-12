package com.github.vladnesterov.vladchat;

import com.github.vladnesterov.vladchat.dto.MessageDto;

import java.util.List;

public interface ChatService {
    List<MessageDto> getMessages(String author, String targetUser);

    void sendMessage(String message, String author, String targetUser);
}
