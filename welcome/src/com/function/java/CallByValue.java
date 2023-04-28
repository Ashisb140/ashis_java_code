package com.function.java;

public class CallByValue {
	
	int data = 45;//property
	
	void change(int data) {
		data = data + 10;
	}

	public static void main(String[] args) {
		
		CallByValue C = new CallByValue();
		
		System.out.println("Before Change:"+C.data);
		
		C.change(49);
		
		System.out.println("After Change:"+C.data);

	}

}
