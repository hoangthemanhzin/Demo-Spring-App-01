package com.demo.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring configuration file:
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from spring container:
		
		CricketCoach theCricket = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call method on the bean:
		
		//close the context:
		context.close();
	}

}
