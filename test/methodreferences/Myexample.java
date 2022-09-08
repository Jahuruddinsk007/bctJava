package com.bct.java8features.methodreferences;

import java.util.Arrays;

//method reference to an interface method of an arbitrary object of a particular type



public class Myexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a collection
		String[] strArry = {"Jahuruddin","Bhushan","Java","Java8","Method","reference"};
		
		/*method reference to an instance method of an arbitrary 
		 * object of a particular type*/
		
		Arrays.sort(strArry,String::compareToIgnoreCase);
		for(String data: strArry) {
			System.out.println(data);
		}
	}

}
