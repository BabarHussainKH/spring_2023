package com.spring.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.beans.Developer;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Main running...");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/metadata/xmlConfig.xml");

		Developer dev1 = context.getBean("dev1", Developer.class);
		System.out.println(dev1);

		((ConfigurableApplicationContext) context).close();
 
	}
}
