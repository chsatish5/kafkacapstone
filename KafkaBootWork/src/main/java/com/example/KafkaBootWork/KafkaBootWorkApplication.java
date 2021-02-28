package com.example.KafkaBootWork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.model")
public class KafkaBootWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaBootWorkApplication.class, args);
	}

}
