package com.girish.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("cfg.xml");
		Student s1 = (Student) context.getBean("student1");
		Student s2 = (Student) context.getBean("student2");
		System.out.println(s1);
		System.out.println(s2);
	}
}
