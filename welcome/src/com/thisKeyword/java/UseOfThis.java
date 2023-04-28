package com.thisKeyword.java;

public class UseOfThis {
	
	int x;
	float y;
	
	

	//this is used to refer current class instance variable
	public UseOfThis(int x, float y) {
		//this();//this constructor should be the first statement inside the constructor
		this.x = x;
		this.y = y;
		System.out.println(x+" "+y);
		this.m1();
		
	}
	

	public UseOfThis() {
		this(34,56.78f);
		System.out.println("this constructor is invoke by 'this' reference keyword.");
	}


	void m1() {
		
		System.out.println("this method call by 'this' reference keyword.");
		
	}





	public static void main(String[] args) {
		
		UseOfThis U = new UseOfThis(23,45.5f);

	}

}
