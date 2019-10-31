package com.github.vladnesterov.vladchat.repository;

import com.github.vladnesterov.vladchat.entity.Message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {

}
