
package com.control_statement.java;

public class Nested_If_Else_Statement {

	public static void main(String[] args) {
		//Multiple decisions
		
		int a=4,b=3,c=2;
		
		if(a>b)
		{
			if(a>c)
				System.out.println("a is greater.");
			else
				System.out.println("c is greater.");
		}
		else
		{
			if(b>c)
				System.out.println("b is greater.");
			else
				System.out.println("c is greater.");
		}

	}
	
	/*
	 * compare between 4,5,6 variables using nested if else.
	 */

}
