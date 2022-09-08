package com.bct.java8features.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>();
		
		names.add("Jahuruddin");
		names.add("Bhushan");
		names.add("Sourav");
		names.add("Hema");
		names.add("Lalit");
		
		
		int count = 0;
		for(String str : names) {
			if(str.length() <= 6) {
				count++;
			System.out.println(str);
			}
		}
		System.out.println("There are : " + count + " Strings with length less than 6!" );
		System.out.println("************************************");
		
		//lets apply stream now ! - using lamba expression
		int data = (int) names.stream().filter(str -> str.length() < 6).count();
		System.out.println("There are : " + data + " String with length less than 6");
	}

}
