package com.example.springboot_sql_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootSqlDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringbootSqlDemoApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();

	}

}
