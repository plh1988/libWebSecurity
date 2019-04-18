package com.pradeep.libraray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class LibrarayWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarayWebApplication.class, args);
	}

}
