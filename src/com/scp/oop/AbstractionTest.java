package com.scp.oop;

public class AbstractionTest {

	/**
	 * Method overloading -- compile time polymorphism
	 * 		-- method name same -- param are differenet
	 * 				-- in terms of 
	 * 						-- No of param
	 * 						-- DT of param
	 * 						-- Seq of param
	 * 				
	 * method overloading can happen in a class or in two classes
	 * method sign should be differnt
	 * 
	 * 
	 * 
	 * Method Overriding
	 * 		-- atleast two classes are required with parent child relationship
	 * 		-- method sign should be exactly same
	 * 		-- it calls runtime object chi method
	 * 		--AM rule
	 * 				1. child class method AM should be exactly same as PCM -- Allowed except private
	 * 		 		2. Child class Method AM should be wider than pCM 
	 * 		--Return Type
	 * 				1.4 -- Same
	 * 				1.5 -- same +
	 * 					child method return type can have parent method return type childs
	 * 					Covariant return type
	 * 
	 * 		-- Method name
	 * 				same
	 * 		-- param 
	 * 				same
	 * 
	 * 
	 * Method overloading -- method sign sodli tr kahich matter nah kart
	 * Method overriding -- AM RT 
	 * 
	 * private  Yes  no 
	 * Static  yes  no
	 * final yes  no
	 * main yes  no
	 * 
	 * 
	 * 
	 * 
	 * inheritance
	 * 		A  -- B    == single
	 * 		A -- B -- C  == multilevel
	 * 		A  -- hierachical
	 *   B     C		
	 * 
	 *   A
	 * B   C   Hybrid  -- is not allwed with classes but thru interfaces possible
	 *   D  
	 * 
	 * 
	 * 
	 * 		A  B  multiple is allowed with classes but thru interfaces yes 
	 * 		  C
	 * 
	 * 
	 * 
	 * ecpasulation
	 * 		
	 * 
	 * 
	 * 
	 * X
	 * 	 Y
	 *     Z
	 * 	 p
	 * 		 N	
	 * 			L		
	 * A
	 * P P m1()
	 * 
	 * B e A
	 * p P m1()
	 *
	 * p v m1(int)
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
	 * 
	 * 
	 * 
	 * 
	 * Method signature = method name + params
	 * 
	 * 
	 * @param i
	 */
	
	public static void main(String[] args) {
		AbstractionTest t = new AbstractionTest();
		//t.m1();
	}
	
}




/**
 * Polymorphism
 * 		-- one name many forms
 * 
 * 
 * 
 */






/**
 * 
 * Abtract means without body
 * 
 * Contract -- 
 * 
 * 
 * interface
 * 		interface <Interfacename>
 * 		variable -- public static final  -- so you should specify the value which is mandatory
 * 		Methods -- public abstract
 * 		abstract keyword is optional
 * 		No objects
 * 		No Constructors 
 * 		100% abstract 
 * 
 * abstract class
 * 		abstract class <className>
 * 		-- no specific rule -- can be as your normal class variables
 * 		-- methods
 * 					-- all abstract
 * 					-- zero abstract
 * 					-- combination
 * 		-- abstract keyword is mandatory
 * 		-- No objects
 * 		-- Constrcuctors are present
 *		can or cannot be 100% abstract 
 */

interface Mobile{
	int mobilePrice=10000;
	 void gallary();
	 String calling();
	
}


class Samsung implements Mobile{

	@Override
	public void gallary() {
		
		System.out.println("spinner effect galary");
	}

	@Override
	public String calling() {
		return null;
	}
	
}

class MI implements Mobile{

	@Override
	public void gallary() {
		System.out.println("spinner");
		System.out.println("Thumbanails");
	}

	@Override
	public String calling() {
		return "WIFi"; //"VOICE";
	}
	
}


class iPhone extends MobileA{

	@Override
	public void abstractGallary() {
		
	}
	
	
	public void smartMobiles(){
		System.out.println("smartphone + additional features");
	}
	
	/**
	 * 
	 * 
	 * 
	 */

}


abstract class MobileA{
	int mobilePrice;
	
	public void smartMobiles(){
		System.out.println("all are smartphones");
	}
	
	
	public void gallary(){
		
	}
	
	abstract public void abstractGallary();
	
}