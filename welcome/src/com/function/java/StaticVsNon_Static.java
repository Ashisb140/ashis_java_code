package com.function.java;


public class StaticVsNon_Static {

	static int x = 0; //static
	
	int y = 0; //non_static
	
	void non_static_method()
	{
		y++;
		System.out.println(y);
	}
	
	void static_method()
	{
		x++;
		System.out.println(x);
	}

	public static void main(String[] args) 
	{	
		StaticVsNon_Static S1 = new StaticVsNon_Static();
		StaticVsNon_Static S2 = new StaticVsNon_Static();
		StaticVsNon_Static S3 = new StaticVsNon_Static();
		
		S1.non_static_method(); //value is not sharing
		S2.non_static_method();
		S3.non_static_method();
		
		S1.static_method();//value is sharing
		S2.static_method();
		S3.static_method();
		
	}

}
