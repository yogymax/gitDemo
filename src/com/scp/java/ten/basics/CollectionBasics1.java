package com.scp.java.ten.basics;


public class CollectionBasics1 {
	
	public static void main(String[] args) {
		/*List<Integer>nums = new ArrayList<>();
		for(int i=0;i<12;i++){
			nums.add(i*i);
		}*/
		
		
		//System.out.println(nums.size());
		
		Object []o = new Object[10];
		Object []o1 = null;
		for(int i=0;i<12;i++){
			o[i]=i*i;
		}
		
		
		//o= Arrays.copyOf(o, cp*3/2+1)
		
		
		/*List l = new List(); //no object for abstract type
		Arraylist l = new List(); //BA
*/		
		
	}
	

}


/**
 * Array
 * 		-- Only allows homogenous dataelements
 * 		-- fixed in size so memory wastage, if not used all
 * 		-- you can not grow and shringup at runtime
 * 		-- you need to specify size in advance
 * 		-- Array dont have backend datastructure
 * 		-- Arrays  -- Utility class for array type of objects
 * 		-- primitivies + objects
 * 
 * 
 * Itarable(I) -- interface
 * Collection(I)  -- interface 	collection extends iterable
 * 			-- is an group of objects as a single entity
 * 			-- Can be stored only objects but not primitivies
 * 			-- We have generic methods/logic, develpment faster
 * 			-- Every collection implementated class has some BDS
 * 			-- Every collection implemented class is growable in nature --  less memory wastage
 * 			-- performance -- slow as compared to array
 * 			
 *
 * collection vs collections  (java.util)
 * Collection (I)
 * Collections (C) -- which is utility class collection implemented classes-- generic methods-- static
 *
 * Interfaces -- which is under Collection interface			
 * List(I)
 * 		-- Arraylist
 * 		-- LinkedList
 * 		-- Vector
 * 			-- Stack
 * Set(I)
 * 		-- Hashset
 * 			--LinkedHashset
 * 		--Sorted (I)
 * 			--NavigabelSet(I)
 * 				--TreeSet
 * Queue(I)
 * DeQueue(I)
 * 			
 * 
 * 
 * 
 * Collection -- 
 * 			-- can store only objects
 * 			-- Will allow homogenous+hetrogenous data elements
 * 			-- every collection implemented class should be growable in nature
 * 			-- should be followed by some data structure
 * List --
 * 			-- Collection properties plus
 * 			-- Allows Duplicate elements
 * 			-- Sequence order preserves
 * 			-- null elements are allowed - many
 * 
 * 		Arraylist
 * 				-- List properties plus
 * 				-- Growable array is a backend datastructure
 * 				-- Default capacity is 10 (1.7 -- eagar loading  , 1.8 lazy)
 * 				-- Incremental capacity = (current capacity * 3/2)+1
 * 				-- Arraylist();   // 10
 * 				-- Arraylist(int) // Arraylist(40);
 * 				-- Arraylist(Collection)
 * 				-- Not synchronized by default  --- 
 * 				-- Fast
 * 				-- Data Inconsistency problem as not synchronized but you can
 * 					synchronize with ---Collections.synechronizeList(listOb);

 * 				-- is not a good choice for insertion and deletetion
 * 					operations as shifting happens (Arrays.copyOf(exisitnArrayRef,cp*3/2+1));
 *  
 * 				-- Arraylist a a good choice -- Searching and Retrival operations
 * 
 * 
 * 
 */
