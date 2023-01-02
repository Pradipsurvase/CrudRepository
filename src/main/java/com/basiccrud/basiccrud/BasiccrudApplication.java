package com.basiccrud.basiccrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.basiccrud.Entity.Student;
import com.basiccrud.Respository.UserRespository;

@SpringBootApplication
public class BasiccrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasiccrudApplication.class, args);		
	}
}