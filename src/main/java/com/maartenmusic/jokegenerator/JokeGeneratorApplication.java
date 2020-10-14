package com.maartenmusic.jokegenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokeGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokeGeneratorApplication.class, args);
	}

}
