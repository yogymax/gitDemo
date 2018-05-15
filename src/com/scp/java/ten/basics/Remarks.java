package com.scp.java.ten.basics;

import com.scp.java.ten.basics.OuterClass.InnerClass;

public class Remarks {
	
	/**
	 * 
	 * Serialization  
	 * 		-- converting java object to network or file supported format
	 * 		-- Entire object will be serialized
	 * 		-- JVM's responsibility, not in user's hand
	 * 		-- Marker interface -- no methods
	 * 		-- writeObject(OOS)  readObject(ooi) -- to encrypt/decrypt 
	 * 			sensitive fields of an object
	 * 		-- it's a recursive algo as it will reach to the parent object
	 * 			by making all fields serialized
	 * 		-- if parent implements serialized,child will be bedefault..
	 * 			in this scenario if you want to serialize child object
	 * 			Parent class must have default constructor -- during 
	 * 			inheritance serialization -- default constructor will be called
	 *      -- reflection mechanism
	 *      --Serialization interface is bit slower and also consumes more memory as
	 *      	entire object fields participate either by their actual/defualt values
	 *  Exteranalization (Customized -- user defined field)
	 *  	-- converting java object to network or file supported format
	 *   	-- If you want not to serialize entier object however you 
	 *   		want to serialize part of object that time you should go for
	 *   		externalization
	 *   	-- User's responsibility
	 *   	-- not a marker interface -- it's child of serialization
	 *   	-- writeInternal(OOS) and readInternal methods are present inside 
	 *   		externalization as this is not a marker
	 *   	--A public no-arg constructor is needed while using Externalizable
	 *   	-- Externalizable interface is fast and also consumes less memory
	 * Deserialization
	 * 
	 * 
	 * Inner class (Nested class)
	 * 		-- Static inner classes  (similar to static field of class)
	 * 		-- NonStatic Inner classes
	 * 				-- Member Inner classes  (similar to  instance fields of a class)
	 * 				-- Method local inner classes (similar to Local fields of method)
	 * 				-- Annonymous Inner classes (On the go implementation)
	 * 
	 * 
	 */

	public static void main(String[] args) {
		//InnerClass innerClass = new InnerClass();
		
		/*OuterClass outer = new OuterClass();
		InnerClass inner = outer.new InnerClass();
		inner.innerClassMethod();*/
		
		//new OuterClass().new InnerClass().innerClassMethod();
		
		new OuterClass().innerField.innerClassMethod();
		
		X x = new X();
		x.displayInfo();
		
		TestInterface t = new TestInterface() {
			@Override
			public void displayInfo() {
				System.out.println("This is annonymous implemetation..");
			}
		};
		
	}
	
}


interface TestInterface{
	public void displayInfo();
}

class X implements TestInterface{

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("This is annonymous implemetation..");
	}
	
}



class OuterClass{
	private int outerVar;
	InnerClass innerField = new InnerClass();
	static int var;
	
	public void outerClassMethod(){
		System.out.println("OUter class Method");
		//innerClass.innerClassMethod();
	}
	
	static class InnerClass{
		private int innerVar;
		public void innerClassMethod(){
			System.out.println("Inner class Method");
			System.out.println(var);
			//System.out.println(outerVar);
		}
		
	}
	
	
	public void localInnerClassDemo(){
		
		final class LocalInnerClass{
			public void m1(){
				System.out.println("inside m1");
			}
		}
		
		LocalInnerClass localInner = new LocalInnerClass();
		localInner.m1();
	}
	
	
}





