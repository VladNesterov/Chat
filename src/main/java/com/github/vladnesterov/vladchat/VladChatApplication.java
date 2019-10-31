package com.github.vladnesterov.vladchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class VladChatApplication {

	public static void main(String[] args) throws InvocationTargetException {
		SpringApplication.run(VladChatApplication.class, args);
	}

}

