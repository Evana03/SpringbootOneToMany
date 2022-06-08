package com.fabro.SpringbootOneToMany;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootOneToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOneToManyApplication.class, args);
	}

	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper;
	}
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
