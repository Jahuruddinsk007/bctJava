package com.bct.java8features.functional.interfaces;

import java.util.function.IntBinaryOperator;

//default interface
interface Myinterface{
	//abstract method
	public void existingMethod(String str);
	default void newMethod() {
		System.out.println("Newly added default method");
	}
}



//inheritance concept
class Example implements Myinterface{
	public void existingMethod(String str) {
		System.out.println("The message is : " + str);
	}
}

//creating our won functional interface


public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lambda operation
		FunctionalInterface sum = (a,b) -> a+b;
		System.out.println("Result = " + sum.addMethod(38, 62));
		
		//predefined function interface
		//lambda expression
		
		System.out.println("********** printed by the predefined interface**************");
		IntBinaryOperator add = (a,b) -> a +b;
		System.out.println("Result = " + add.applyAsInt(76, 24));
		
		//creating an object to the class example
		Example em = new Example();
		//calling the 
	}

}
