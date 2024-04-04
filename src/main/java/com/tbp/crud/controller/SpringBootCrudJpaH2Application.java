package com.tbp.crud.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SuppressWarnings("unused")
@SpringBootApplication
@EnableJpaRepositories("com.tbp.crud.dao")
public class SpringBootCrudJpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudJpaH2Application.class, args);
	}

}
