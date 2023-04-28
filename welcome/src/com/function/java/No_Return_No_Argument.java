package com.function.java;

public class No_Return_No_Argument {
	
	
	/*
	 * 1. Function is a self-contained block of statements.
	 * 2. 2 types of function 1. Built-in function Math.POW(),Math.SQRT() 2. User-Defined Function
	 * 3. How to recognize a function?
	 * User Defined Function
	 * return-type name_of_function(parameter/argument) { }
	 * 
	 * types of user-defined function
	 * ==============================
	 * 1. no return no argument   Ex - void sum(void)
	 * 2. no return with argument Ex void sum(int x,int y);
	 * 3. with return no argument
	 * 4. with return with argument
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {//Open Curl brace
		
		sum();//calling
		

	}//close curly brace

	//function declaration part
	static void sum() {//called
		
		int a=2;
		int b=3;
		int sum = a+b;
		System.out.println(sum);
		
		sub();
		
	}

	static void sub() {
		int a=2;
		int b=3;
		int sub = a-b;
		System.out.println(sub);
	}

}
