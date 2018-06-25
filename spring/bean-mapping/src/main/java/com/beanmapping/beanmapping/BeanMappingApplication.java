package com.beanmapping.beanmapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beanmapping.beanmapping.beans1.Bean1;
import com.beanmapping.beanmapping.beans1.BeanConfiguration;
import com.beanmapping.beanmapping.beans2.Bean2Config;

@SpringBootApplication
public class BeanMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanMappingApplication.class, args);

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(BeanConfiguration.class);
		applicationContext.register(Bean2Config.class);

		applicationContext.refresh();

		System.out.println("testing bean configuration on app context");

		Bean1 b1 = applicationContext.getBean("bean1", Bean1.class);
		System.out.println(b1);
		
		
		applicationContext.close();

	}
}
