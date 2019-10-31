package com.github.vladnesterov.vladchat.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    Long id = null;

    @Column(name = "message", nullable = false)
    String message;

    @Column(name = "created_at", nullable = false)
    LocalDateTime createdAt;

    @Column(name = "author", nullable = false)
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


    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

}
