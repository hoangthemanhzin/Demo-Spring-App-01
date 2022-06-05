package com.demo.spring1;

public class Myapp {
	public static void main(String[] args) {
		
		//create the object
		Coach theCoach = new TrackCoach(null);
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());
	}
}
