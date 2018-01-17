package com.test.groovy1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.FirstTestClass;
import service.SecondTestClass;

@SpringBootApplication
public class Groovy1Application  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Groovy1Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		FirstTestClass firstTestClass=new FirstTestClass();
		firstTestClass.getName();
		firstTestClass.functionB(1);
		SecondTestClass secondTestClass = new SecondTestClass();
		secondTestClass.func1();
		firstTestClass.testThirdClass();
	}
}
