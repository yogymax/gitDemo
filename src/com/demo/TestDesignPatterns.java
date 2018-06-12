package com.demo;


public class TestDesignPatterns {
	
	public static void main(String[] args) {
		System.out.println("Singleton");
		Student st1 = Student.getInstance();
		Student st2 = Student.getInstance();
		
		System.out.println(st1==st2); //true
		
	}
	
}

class Student{

	/**
	 * lazy Inialization --
	 * 
	 */
	private static Student studentOb ;
	private Student(){
		//to restrict object creation outiside class
	}
	public static Student getInstance(){
		if(studentOb==null){
			synchronized (Student.class) {
				if(studentOb==null)
						studentOb= new Student();	
			}
		}
		return studentOb;
	}
	
	
	
}



/**
 * Design patterns
 * 			-- Industry standard approach
 * 			-- reusablity
 * 			-- makes your application robust one
 * 			-- if you follow design pattern -- application becomes easy to 
 * 				maintain and to extend
 * 
 * 
 *  Singleton
 *  		-- At a time there should be single object to serve entire application
 *  		-- Examples -- database configuration object, SessionFactory
 *  		
 *  		-- Prerequisities
 *  				-- Constructor should be private
 *  				-- take one static variable of class {Your class name} type
 *  				-- write one public static method which return your class object
 *  			
 *  		
 * 
 * 
 */


/**
	 * Eager inilization
	 * 
	 * If we dont require an object still object will be created on memory
	 * 	as we are using static which loads/creates the object at the time 
	 * of student class loading into memory
	 * 
	private static final Student studentOb = new Student();
	private Student(){
		//to restrict object creation outiside class
	}
	public static Student getInstance(){
		return studentOb;
	}
	
Note -- this is for Static block inilizations, make sure object is inilialized inside 
static block and keep it final dont assign even null
		static{
		studentOb=new Student();
	}

	
lazy inilizations
		-- if two threads exeuting this method and gets studentOb as null
			those threads will end up with creating two different objects
				
private static  Student studentOb;
public static Student getInstance(){
		if(studentOb==null){
			studentOb= new Student();
		}
		return studentOb;
	}


ThreadSafe SingleTone
	keep above code as it is -- and apply synechronized keyword at method level
	 -- static synechronized --
	 			-- it acquires lock at class level it will affect the application 
	 				perfomance --
	 				
Double checking Threadsafe Singleton
			use synechronized Block instead of static synechronied method
		if(studentOb==null){
			synchronized (Student.class) {
				if(studentOb==null)
						studentOb= new Student();	
			}
		}
		return studentOb;

Bill Pugh--
    eagar inilization with static inner class

Why singleton
When we need it
Did you used it in your project-- tell me where
Does immutable object means singleton -- Yes/No explain
Does Immutable means thread safe-- Yes/No explain
Does singleton means objects are thread Safe -- Yes/No explain
Does singleTone means immutable -- -- Yes/No explain



Enum + Next if singleton implementaions--



	
	
	

	
	
 */


