package com.bct.java8features.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Integer> myNumber = new ArrayList<Integer>();
		
		myNumber.add(12);
		myNumber.add(17);
		myNumber.add(9);
		myNumber.add(7);
		myNumber.add(38);
		
//		for(int data : myNumber) {
//			if(data % 2 == 0) {
//				System.out.println("Even number are : " + data);
//			}
//			else {
//				System.out.println("Odd number is : " + data);
//			}
//		}
//		System.out.println("******************************");
//		int res = (int) myNumber.stream().filter(str -> str % 2 == 0).count();
//		System.out.println("Even number are : " + res);
		
		myNumber.stream().forEach(j -> {if (j.intValue() % 2 == 0) {System.out.println("The number is even!");;}else {
			System.out.println("The number is odd!");;}});
		}
	}


