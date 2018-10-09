package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		log.info("Start Application.. ");
		SpringApplication.run(Application.class, args);
	}
	
}
