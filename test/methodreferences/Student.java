package com.bct.java8features.methodreferences;

import java.util.function.BiFunction;

interface myInterface{
	public void display();
}

/*
 * Method reference to static method of the class
 * */

class Addition{
	static int add(int x, int y) {
//		System.out.println(x+y);
		return x + y;
	}
}

public class Student {
	
	/*
	 * method references is the short hand notation of lambda expression to call a method
	 * 
	 * str -> System.out.println(str);
	 * System.out::orintln
	 * 
	 * */
	
	//--->make refence to the abstract method and instance method
	//method reference to an instance method of an object - object::instancemethod
	
	public void myMethod() {
		System.out.println("Instance method");
		System.out.println("************I have been referenced by the abstract************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object to class -- Student
		Student obj = new Student();
		
		//method reference using the object of the class
		myInterface ref = obj::myMethod;
		
		//calling the method of functional interface
		ref.display();
		
//		System.out.println("********************************");
//		obj.myMethod();
		
		
		BiFunction<Integer,Integer,Integer> addition = Addition::add;
		int sum = addition.apply(12, 32);
		System.out.println("Addition of two number is : " + sum);

	}

}
