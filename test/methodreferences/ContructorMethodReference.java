package com.bct.java8features.methodreferences;

interface ConstructorInterface{
	Hello display(String say);
}
class Hello{
	 Hello(String say) {
		System.out.println("Good morning guys...!" + say);
	}
}
public class ContructorMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method reference to a constructor.
		
		ConstructorInterface ref = Hello::new;
		ref.display("How are you doing...?");

	}

}
