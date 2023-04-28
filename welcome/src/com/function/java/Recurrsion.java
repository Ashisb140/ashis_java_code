package com.function.java;

public class Recurrsion {

	public static void main(String[] args) {
		
		//Function called itself repeatedly is called recursion
		System.out.println(fact_recur(10));

	}

	static int fact_recur(int i) {
		if(i==0)
			return 1;
		else
			return i*fact_recur(i-1);
		/*
		 * 5*5-1
		 * 5*4*4-1
		 * 5*4*3*3-1
		 * 5*4*3*2*2-1
		 * 5*4*3*2*1*1-1
		 * 
		 */
		
		
		
	}

}
