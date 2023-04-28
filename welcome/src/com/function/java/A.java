package com.function.java;

public class A {

	int x=45;//non_static
	static int y=9;
	
	public static void main(String[] args) {
		
		A a1 = new A();//new A(); a1 is a instance
		
		pass_instance(a1);
		
		A a2 = return_instance(new A());
		System.out.println(a2);
		
		non_static();
		
		A a = new A();
		a.call_by_value(23);
		
	}

	private void call_by_value(int a) {
		x = x+a;
		System.out.println(x);
	}

	private static void non_static() {
		System.out.println(y);
		
	}

	private static A return_instance(A a1) {
		
		return a1;
	}

	private static void pass_instance(A a1) {
		a1.x=2;
		System.out.println(a1);//hashCode
		
	}

}
