package com.example.BikeProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitExampleApplication.class, args);
	}
	public void add() {
		System.out.println(2+2);
	}
	
	public void subract() {
		System.out.println(2-2);
	}

	public void multiplly() {
		System.out.println(2*2);
	}
	

}
