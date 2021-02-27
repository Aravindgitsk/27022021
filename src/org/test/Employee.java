package org.test;

public class Employee extends Company {
	
	public  Employee() {
		super(100);
		System.out.println("child default constructor");
	}
		
		public Employee(int empId) {
			System.out.println(empId);
		}
		public static void main(String[] args) {
			Employee e = new Employee();
			Employee e1= new Employee(123);
		}
		
	
		
		
	}
	


