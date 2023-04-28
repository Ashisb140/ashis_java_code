package com.function.java;

public class CallByReference {
	
	int data = 45;
	
	void change(CallByReference C) {
		C.data = C.data+45;
	}
	
	public static void main(String[] args) {
		
		CallByReference C = new CallByReference();
		
		System.out.println("Before Change:"+C.data);
		
		C.change(C);
		
		System.out.println("After Change:"+C.data);

	}


}
