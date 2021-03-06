package com.dc.jvm8.interfaces;

import com.dc.jvm8.interfaces.impl.IMockFunctionalInterface;
import com.dc.jvm8.interfaces.impl.IMockInterface;
import com.dc.jvm8.interfaces.impl.IMockInterfaceWithArguments;

public class MockImpl {
	public static void main(String[] args) {
		
		/***
		 * Lambda Expression - can only appear in places where they will
		 * be assigned to a variable whose type is a functional interface
		 * 
		 * A functional interface has a single abstract method , Prior to Java8 
		 * they are known as Single Abstract Method SAM Types
		 ***/
		IMockInterface mock = ()-> "Inteface  (SAM) Types";
		System.out.println(mock.getMessage());
		
		IMockFunctionalInterface funcInterface = () -> "Functional Interface via Annotations";
		System.out.println(funcInterface.getMessage());
	
		IMockInterfaceWithArguments arguments = (v1,v2) -> {
			int result = v1+v2;
			System.out.println(" The sum is "+ result);
		};
		
		arguments.getSum(11, 22);
		
		
	
	}
}
