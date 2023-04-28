package com.control_statement.java;

public class Nested_For_Loop {
	
	public static void main(String[] args)
	{
		/*
		 * 11 12
		 * 21 22
		 * 
		 * 11 12 13
		 * 21 22 23
		 * 31 32 33
		 * 
		 */
		
		for(int i=1;i<=3;i++)//i = row
		{
			for(int j=1;j<=3;j++)//j = column
			{
				System.out.print(i+""+j+" ");//row & column
			}
			System.out.println();//newline
		}
	}
	/*
	 * Nested while and do..while loop
	 * 
	 */

}
