package com.dc.jvm8.interfaces;

import com.dc.jvm8.interfaces.impl.IMockInterface;

public class MockImpl {
	public static void main(String[] args) {
		
		/***
		 * Lambda Expression - can only appear in places where they will
		 * be assigned to a variable whose type is a functional interface
		 * 
		 * A functional interface has a single abstract method , Prior to Java8 
		 * they are known as Single Abstract Method SAM Type
		 ***/
		IMockInterface mock = ()-> "Wonderful";
		System.out.println(mock.getMessage());
	}
}
