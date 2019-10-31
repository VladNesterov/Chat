package com.github.vladnesterov.vladchat.dto;

import java.time.LocalDateTime;

public class MessageDto {

    String message;

    LocalDateTime createdAt;

    String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }


}
