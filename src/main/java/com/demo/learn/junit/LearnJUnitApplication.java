package com.demo.learn.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.learn.junit.sample.Sample;

@SpringBootApplication
public class LearnJUnitApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnJUnitApplication.class, args);
		Sample sample = context.getBean(Sample.class);
		sample.mainMethod();
	}

}
