package com.springcode.codestart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication(scanBasePackages={"com.springcode"})
@ComponentScan("com.springcode")
@EntityScan("com.springcode.model")
@EnableJpaRepositories("com.springcode.repository")
public class CodeStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeStartApplication.class, args);
	}
}
