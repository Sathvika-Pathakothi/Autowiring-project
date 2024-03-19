package com.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("autowire.xml");
		Book s = (Book)context.getBean("a1");
		s.show();
		// TODO Auto-generated method stub
		

	}

}