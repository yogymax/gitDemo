package com.scp.java.ten.basics;

import java.util.ArrayList;
import java.util.List;

public class CollectionBasics2 {

	
	public static void main(String[] args) {
		/**
		 * 
		 * 
		 * 
		 * 
		 * 
		 * A<? extends Number>  -- Upper bound
		 * A<?>  -- object
		 * A<? super Number>   -- Lower bound
		 * 
		 * ncap = cp + (cp/2)
		 * 
		 *  >>   -- Right shift
		 *  <<  -- left shift
		 *  <<<  -- right shift with filled zero
		 *      0 0 0 0 1 0 1 0
		 *      0 0 0 1 0 1 0 0
		 */
		
		
		List<Integer> listOfNums = new ArrayList<>();
		listOfNums.add(10);
		listOfNums.add(12);
		listOfNums.add(123);
		listOfNums.add(10);
		listOfNums.add(145);
		listOfNums.add(60);
		listOfNums.add(70);
		listOfNums.add(10);
		listOfNums.add(15);
		
		
		/**
		 * 
		 * 
		 * 
		 * List Down collection/List methods and atleast one description 
		 * 		-- which class
		 * 			-- which method (Sign) -- methodname+param
		 * 				-- return type
		 * 
		 *  try to have examples-- make note
		 *  
		 *  List out properties of List Arraylist
		 *  shift operators
		 *  upper bound  -- extends
		 *  lower bound   super
		 *  nobound   
		 *  
		 *  
		 *  
		 *  
		 * 
		 * 
		 * 
		 */
		
		
		/**
		 * Types of cursors
		 * Iterator  -- All Collection implemented classes 
		 * ListItertor  -- All List Implemented Classes
		 * Enumaration  -- On Legacy Classes (1.0)
		 * 						- Vector
		 * 						- stack
		 * 						- hashtable
		 * 						- dictionary
		 * 						- properties
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		System.out.println(listOfNums.indexOf(10));
		System.out.println(listOfNums.lastIndexOf(10));
		
		System.out.println(listOfNums);
		List<Integer> newList = listOfNums.subList(0, 5);
		System.out.println(newList);
		newList.add(3,1000);
		System.out.println(newList);
		
		
		
		
		/**
		 * remove -- pass kelela obj remove karycha
		 * removeall -- pass kelela collection kadaycha
		 * retainall -- pass kelela collection theun bakich kadayach
		 * clear -- sglch kadaych
		 * 
		 * 
		 * 
		 */
		
		
		
		
	
	}
	
}


class Xy{
	
}

class Pqr extends Xy{
	
}