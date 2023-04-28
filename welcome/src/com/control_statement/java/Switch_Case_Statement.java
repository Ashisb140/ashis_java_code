package com.control_statement.java;

import java.util.Scanner;

public class Switch_Case_Statement {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);

		System.out.println("Enter the value of n:");
		
		//Multiple Decisions
		int n = Sc.nextInt();//.nextFloat(),.next().charAt(0),next(),nextLine()
		
		switch(n%2)//0
		{
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		default:
			System.out.println("Neither Even Nor Odd.");
		}
		System.out.println("After Swicth Break statement Hit.");
		/*
		 * switch(statement or expression)
		 * {
		 *   case-label-1:
		 *      statement-1;
		 *      break;
		 *   case-label-2:
		 *   	statement-2;
		 *   	break;
		 *   default:
		 *   	statement-n;
		 *   	break;
		 * }
		 * 
		 * Enter a digit 0-9 and print in words 0->zero, 1->One and so on.
		 *  
		 */
		
		
	}

}
