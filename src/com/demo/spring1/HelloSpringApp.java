package com.demo.spring1;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean spring from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		//let's call our new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}
