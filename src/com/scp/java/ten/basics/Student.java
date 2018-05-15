package com.scp.java.ten.basics;

public class Student {
	String studName; //250
	int studId;//4
	static String collegeName="PICT";//250
	/**
	 * Three types of var
	 * 	
	 * 
	 * Instance
	 * 	1# -- Varibles declared at class level without static keyword outside
	 * 		  method/block/constructor
	 *  2# -- memory -- at the time of object creation
	 *  3# -- where -- Inside object on heap
	 *  4# -- Copies -- Every object will get a seperate copy
	 *  5# -- Variables can be public protected private default final but not static
	 *  6#  implicity initialized to default values
	 *  7# Object level Scope
	 *  8# object var
	 * 
	 * Static
	 *  1# -- Varibles declared at class level with static keyword outside
	 *  	  method/block/constructor
	 *  2# -- memory -- at the time of class loading
	 *  3# -- where -- Method area
	 *  4# -- Copies -- Every object will same copy/same copy will be shared across al obj
	 *  5# -- Variables can be public protected private default final should be static
	 *  6#  implicity initialized to default values
	 *  7# class Level 
	 *  8# class level var/global var
	 * Local
	 *  1# -- Varibles declared at inside method/block/constructor
	 *  2# -- memory -- at the time of method/block/constructor execution
	 *  3# -- where -- thread stack
	 *  4# -- Copies -- every execution will get fresh copy
	 *  5# -- Variables can only be final 
	 *  6#   no implicitly inilization, developer has to inilize local var before
	 *  	using that.
	 *  7# method/block/constructor level
	 *  8# Temp variable
	 *  
	 *  
	 *  
	 *  Java Prog Execution Life Cycle
	 *  
	 *  >javac Student.java   ----- student.class
	 *  >java Student
	 *  
	 *  Class loaders will come in to pictures
	 *  1#BootStrap  -- Will load basic jars required to execute java prog -- java jar's
	 *  2#Extension  -- Will load class files from ext folder (Additional capability)
	 *  3#Application -- this will load our java class file for execution 
	 *   		and the same time your jre will prepare an env for execution of .class file
	 *  
	 *  At the time of class loading -- java will give memory to your
	 *  static fields on method area
	 *  then main method will be starting point of ur prog execution 
	 *  and then o
	 *  
	 *  
	 *  
	 *  Java Memory Blocks
	 *  Method Area  -- Static fields, Interface Variables, class Metadata
	 *  Heap -- heap internally has scp(String constant pool) --- Objects --inside objects instance fields
	 *  Thread Stack -- Local Var -- Method calling chain-- stacktrace-- intermeditate results of an expression
	 *  Prog Counter  -- address of a next instruction to be given to cpu for execution
	 *  Native Stack  -- this is storage area for the code which is been written/called from 
	 *  other prog lang.
	 *  
	 *  
	 
	 *  Configuration
	 *  Eclipe Setup
	 *  PRoject creation
	 *  write class -- try to execute that
	 *  
	 *  Types of var
	 *  memory model
	 *  execution cycle
	 *  
	 *  
	 *  
	 *  
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int i=10;
		System.out.println("inside main method...!");
		Student st1 = new Student();
		Student st2 = new Student();
		st1.studId=10;
		st1.studName="ABC";
		st2.studId=20;
		st2.studName="PQR";
		st1.showInfo();
		
	}
	
	
	public void showInfo(){
		System.out.println("studName --" +studName);
		System.out.println("studId --" +studId);
		System.out.println("studClgName --" +collegeName);
		
	}
	
	public void showDetails(){
		System.out.println("studName --" +studName);
		System.out.println("studId --" +studId);
		System.out.println("studClgName --" +collegeName);
		
	}
}


/**
 * 
 * 
 * Idenfiers
 * 		Class  -- Collection of methods and var/ template /blueprint /structure
 * 		Method  -- collection of java statements/reuse
 * 		Varible  -- it's a name given to memory location
 * 		object -- instance/snapshot taken at perticular time
 * 
 */

