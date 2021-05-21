package com.ashok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ashok","com.ashokit.dao"})
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		System.out.println(run.getBean("UserDAO.Class"));
		int i=10;
		System.out.println("first spring boot app");
		System.out.println("didnt close context object");
		//run.close();
	}

}
