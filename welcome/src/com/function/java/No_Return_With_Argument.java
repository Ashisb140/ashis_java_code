package com.function.java;

public class No_Return_With_Argument {

	public static void main(String[] args) {
		
		int x=2,y=3;
		
		sum(x,y);//actual argument

	}

	static void sum(int x, int y) //formal argument
	{
		int sum = x+y;
		System.out.println("Sum= "+sum);
	}

}
