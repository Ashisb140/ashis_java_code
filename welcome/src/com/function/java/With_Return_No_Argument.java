package com.function.java;

public class With_Return_No_Argument {

	public static void main(String[] args) {
		
		//With Return No Argument
		
		int addition = sum();
		System.out.println(addition);
		
		System.out.println(sub());

	}

	private static int sub() {
		int x=3,y=2;
		return x-y;
	}

	static int sum() {
		int x=4,y=5;
		return x+y;
	}

}
