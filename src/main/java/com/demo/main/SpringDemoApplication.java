package com.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
		System.out.println("Start Demo Application");
		System.out.println("*************SPRING APPLICATION STARTED SUCCESSFULLY*****************");
		System.out.println("End Demo Application");

	}

	private void loadOnStartup() {
		System.out.println("Load on startup");
	}
}
