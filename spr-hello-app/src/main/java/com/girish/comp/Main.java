package com.girish.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.girish.comp.MyBean;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		MyBean ref = (MyBean)appCntx.getBean("mb");
		System.out.println(ref.getMsg()); 
	}

}
