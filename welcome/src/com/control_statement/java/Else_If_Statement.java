package com.control_statement.java;

public class Else_If_Statement {

	public static void main(String[] args) {
		//Else If ladder used at multiple decision.
		int a=3,b=5,c=1;
		
		if(a>b && a>c)
			System.out.println("a is greater.");
		else if(b>a && b>c)
			System.out.println("b is greater.");
		else
			System.out.println("c is greater.");
	}
}
//enter 5 marks of a student find total,
//avg then submit that avg to check avg>=60 -> G-A, >=50 -> G-B, >=40 -> G-C, >=30 G-D, G-F(default).