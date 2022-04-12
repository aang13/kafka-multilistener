package com.kafka;

import com.kafka.config.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, Object> kafkaTemplate) {
		return args -> {
			kafkaTemplate.send("greeting", new Greeting("hi moinul"));
			kafkaTemplate.send("people", new People(29,"anton"));
		};
	}
	
	
}
