package com.example.BikeProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitExampleApplicationTests {

	@Test
	void contextLoads() {
	}
	JunitExampleApplication j=new JunitExampleApplication();
	@Test
	public void checkAdd() {
		j.add();
	}
	@Test
	public void checksub() {
		j.subract();
	}

}
