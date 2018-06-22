package com.scp.serialization;

/**
 * 
 * 
 * 
 * Execuction steps
 * 		-- class loading
 * 				-- static block execution 
 * 				-- main method execution 
 * 						line 6 and 7  -- once
 * 				-- Object creation statments Emp e1 = new Emp()
 * 								instance block execution 
 * 								Constructor Execution 
 *   line no 10 n 11 = repeated = No of object 
 */
public class Employee {
	
		// public static void main(String type array)
		public static void main(String[] args) {
			//This is the starting point for program execution -- jvm search
			System.out.println("inside main method");
			
			//what is object --- instance of class/snapshot of class/product of a emp structure/user defined data type
			Employee emp1 = new Employee(); //250+250+8+4 : 512byte
			Employee emp2 = new Employee(); //250+250+8+4 : 512byte
			
			//Employee : Class -- User defined class -- User defined data type
			//emp1 : variable,identifier,ref variable
			//= : Assigment operator
			// new : will allocate the memory to your employee object
			//Employee() : constructor -- 
			
			
			
		}
	
		int empId; //4| 0 
		String empName; //250 | null
		String empAddress;//250 | null
		double salary; //8 | 0.0d

		{

			System.out.println("inside instance block");
			//Object creation prerequisites
		}
		
		static{
			System.out.println("inside static block");
			//class creation prerequisites
		}
		
		public void instanceMethod(){
			System.out.println("inside instatnce method");
		}
		
		public static void staticMethod(){
			System.out.println("inside static method");
			//class level business logic // same logic for every object
		}
		  
		public Employee(){
			System.out.println("inside constructor");
			//initialize the instance fields
		}
		
	
		
}
