package com.scp.seleniun.third;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionFramework {
	
	public static void main(String[] args) {
		
		int [] nums = new int[5];//Array
		nums[0]=10;
		nums[1]=10;
		nums[2]=10;
		nums[3]=10;
		nums[4]=10;
		//nums[5]=10;
		
		List<Integer> listOfNums = new ArrayList<>(5); //AL
		listOfNums.add(10);
		listOfNums.add(20);
		listOfNums.add(30);
		listOfNums.add(40);
		listOfNums.add(10);
		listOfNums.add(10);
		
		
		List<Integer> setOfNums = new ArrayList<>();
		//Set<Integer> setOfNums = new HashSet<>();
		setOfNums.add(10);
		setOfNums.add(152);
		setOfNums.add(151);
		setOfNums.add(11);
		setOfNums.add(14);
		setOfNums.add(10);
		setOfNums.add(10);
		setOfNums.add(null);
		setOfNums.add(null);
		setOfNums.add(null);
		System.out.println(setOfNums);
		System.out.println(setOfNums.size()); //5
		
		/**
		 * Key
		 * 			duplicate chalat nah
		 * 			single null chalte
		 * Value
		 *      duplicate chalte
		 *      
		 * 
		 */
		Map<Integer, String> hmap = new HashMap<Integer, String>();
	System.out.println(	hmap.put(10, "TEN")); //null 
	System.out.println(	hmap.put(10, "TEN1")); //TEN
	System.out.println(hmap.put(null, "nullValue"));//null
	System.out.println(hmap.put(null, "TEN"));//nullvalue
	System.out.println(hmap.put(4, "Four")); //null
	System.out.println(hmap.put(0, "Zero")); //null
		
		/*[
		10,TEN1
		null, TEN
		4, Four
		0 Zero
		
		]*/
		
		System.out.println("Hashmap size -- "+hmap.size());//
		System.out.println(hmap);
		
		/**
		 * if key is duplicate -- replace the existing value with new value
		 *if key is not duplicate -- returns null 
		 */
		
		
		
	}
	
	/**
	 * Array
	 * 		-- homogenous data elements
	 * 		-- Fixed in size
	 *      -- Memory wastage
	 *      -- primitives and objects
	 * Collections
	 * 		-- homogeneous + hetrogenous 
	 * 		-- Growable in nature by default
	 * 		-- No memory wastage (ofcourse there is memory wastage to certain extent)
	 *    -- only objects
	 *    
	 * Collection
	 * 		List
	 * 				-- Duplicate allowed
	 * 				--  Insertion order is preserved
	 * 				-- multiple null allowed
	 * 		Set
	 * 			-- Duplicates are not allowed
	 * 			-- sequence order is not preserved
	 * 			-- single null is allowed
	 * 
	 * 
	 * 
	 * Map
	 * 		-key and value pair will be stored
	 * 		--key
	 * 				-- duplicate not allowed
	 * 				--- single null is allowed
	 * 		--value -
	 * 					--- duplicate allowed
	 * 					-- multiple null allowed
	 * 		-- map doesnt preserve seq order
	 * 
	 * 
	 * List
	 * 		Arraylist
	 * 				-- default size is 10
	 * 				-- cp*3/2+1    == 10*3/2+1 = 16
	 * 				-- insertion and deletion operations -- al is not a good choice
	 * 				-- searching and retrival of an element is faster
	 * 				-- load factor/fill ratio = 100%
	 * 				-- Data structure -- Array
	 * Set
	 * 		Hashset  
	 * 				-- 16
	 * 				-- grow = cp*2
	 * 				-- load factor/fill ratio = 0.75
	 * 				-- Hashtable
	 *				-- internally uses hashmap
	 *						-- whatever value that your are passing to add method becomes key of
	 *							your hashmap and dummy object will be the value of that hashmap 
	 * 	
	 * Map  <K,V>
	 * 			HashMap
	 */
	

}

