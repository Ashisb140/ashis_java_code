package com.constructor.java;

public class Employee {
	
	int empId;
	String empName;
	float empSalary;
	
	public Employee() //default constructor
	{
		//initialize
		empId = 36654;
		empName = "Rohit Sharma";
	}

	public Employee(int i, String string) {
		empId = i;
		empName = string;
	}
	
	

	public Employee(int i, String string, float f) {
		
		empId = i;
		empName = string;
		empSalary = f;
	}

	public static void main(String[] args) 
	{
		Employee E = new Employee();//Call the default constructor
		System.out.println(E.empId+" "+E.empName);
		Employee E2 = new Employee(5356,"Rahul Kumar"); 
		System.out.println(E2.empId+" "+E2.empName);
		Employee E3 = new Employee();
		E3 = E2;
		System.out.println(E3.empId+" "+E3.empName);
		Employee E4 = new Employee(1874,"Rohit Mishraa",45000.00f);
		System.out.println(E4.empId+" "+E4.empName+" "+E4.empSalary);
	}
}
