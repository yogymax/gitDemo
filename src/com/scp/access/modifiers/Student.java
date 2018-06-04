package com.scp.access.modifiers;

public class Student {
	//Instance var
	int rollNo;
	static String collegeName; //1
	
	static{
		System.out.println("Static block"); //2
	}
	
	
	{
		System.out.println("instance block");//5
	}
	
	//Constructor 
	public Student() {
		System.out.println("constructor");//6
	}
	
	public void displayStudInfo(){
		System.out.println("instance method");
	}
	
	static public  void showStudentInfo(){
		int i=10;
		System.out.println("static method");
	}

	
	/**
	 * javac Student.java
	 *     Student.class
	 *  java Student
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {//3
		System.out.println("static main method");
		Student st1 = new Student();
		st1.studName="xyz";
		st1.rollNo=101;
		Student st2 = new Student();
		st2.rollNo=102;
		st2.studName="PQR";
		
		
		st2.collegeName="PICT";
		
		System.out.println("st1 information");
		System.out.println(st1.rollNo);
		System.out.println(st1.studName);
		System.out.println(st1.collegeName);
		
		
		/**
		 *
		 * s - s == direct
		 * s- i== obj ref required
		 * I - S == direct
		 * I - I -- direct
		 * 
		 * 
		 * 
		 * 
		 * static areat t static field la access -- main clg/showinfo -- direct
		 * static areat t instance field -- main madhn rollNo/disInfo -- obj ref
		 * 
		 * insstance area -- static field - direct
		 * instance area -- instance field --
		 * 
		 * 
		 * 
		 * 
		 */
		
	}
	
	String studName;//4
}

/**
 * Method -- set of lines 
 * 
 * Syntax -- Access Modifiers MethodReturnType MethodName(){ }
 * Static --  AccessModifiers static MethodReturnType MethodName(){ }
 * AM - Seq doenst matter which should before method return type
 * 
 * Constructor -
 * 		It's a special method which has same name as ur class name
 * 		should not have return type not even void
 * 
 * 
 * Steps
 * 		Compile with javac Student.java
 * 		execute with java Student
 * 		Java's classloader will load .cls file into main memory
 * 		it will start scanning static fields of that class
 * 
 * 		Static fileds of that class will get memory on method area
 * 		Static block will get executed
 * 		main method will get executed
 * 		instance fields will get memory on heap
 * 
 * 		
 * 
 *
 * Instance Var
 * 		-- class level outside method block constrctuor
 * 		-- at the time of object creation
 * 		--heap
 * 		-- Object level scope
 * 		-- instance/object level
 * 		-- I - I  == direct
 * 		-- I - S  == Direct
 * 		-- every object will get fresh copy
 * 	
 * Static Var
 * 		-- class level outside method block constrctuor + static
 * 		-- at the time of class loading
 * 		-- method area
 * 		-- class level/global var/ static var
 * 		-- S - S  == direct
 * 		-- S - I  == ORR
 * 		-- static var's shared across all objects of that class -- sharing var
 * Local var
 * 		-- inside method/block/constructor
 * 		-- at the time execution of the method/b/c
 * 		-- Thread stack
 * 		-- within m/b/c
 * 		-- temp var/intermediate var
 * 		-- Local scope if after u have obj ref you cannot access local varibale
 * 		outside m/b/c
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */





