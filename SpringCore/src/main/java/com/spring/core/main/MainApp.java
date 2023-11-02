package com.spring.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.beans.Developer;
import com.spring.core.beans.Experience;
import com.spring.core.beans.Projects;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Main running...");

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/metadata/config3.xml","com/spring/core/metadata/config2.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/metadata/config3.xml");

//		Developer dev1 = context.getBean("dev1", Developer.class);
//		System.out.println(dev1);
//
//		Developer dev2 = context.getBean("dev2", Developer.class);
//		System.out.println(dev2);
//
//		Experience experience = context.getBean("exp1", Experience.class);
//		System.out.println(experience);
//
//		Projects proj1 = context.getBean("proj1", Projects.class);
//		System.out.println(proj1);

		Developer bean = context.getBean("dev", Developer.class);
		System.out.println(bean);
		Developer bean1 = context.getBean("dev", Developer.class);
		Developer bean2 = context.getBean("dev", Developer.class);
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean.hashCode());
		System.out.println(bean1.hashCode());
		System.out.println(bean2.hashCode());
		((ConfigurableApplicationContext) context).close();

	}
}
