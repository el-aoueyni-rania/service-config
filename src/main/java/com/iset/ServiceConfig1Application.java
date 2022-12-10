package com.iset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServiceConfig1Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConfig1Application.class, args);
	}

}
