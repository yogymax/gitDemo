package com.scp.java.ten.basics;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

/**
 * LinkedList
 * 		-- No size required bcoz nodes as we add it will be
 *  		added at the end
 * 		-- no incremental capacity 
 * 		-- |head |data | tail (ref of next node (head)) | <------> |prev node tail |data |tail=null |
 * 		-- Not synechronized
 * 				-- refer arraylist points
 * 		-- insertion and deletetion operation good choice
 * 		-- searching and retrival are not a good choices
 * 		--
 * 
 * 
 * Vector
 * 		-- groable array
 * 		-- initial capacity 10
 *      -- doubles the size  -- arraylist will cp+(cp>>1)
 *      -- fill ratio constructor present which is not in arraylist
 * 		-- Vector is synechronized
 * 		-- Legacy 
 * 		-- cursor -- enumaration will also work
 * 
 * 
 * AL vs LL
 * AL vs Vector
 * LL vs Vector
 * AL vs Array
 * Collection vs Collections
 * collection methods with one line description
 * collections methods (imp) with one line description
 * when to use AL over LL and vice versa
 * Arrays methods -- imp
 * iterator vs Listiterator vs enumaration
 * Try to write small programs using collection classes
 * whichever we covered so far... 
 * stack methods
 * stack ds
 * 
 * 
 * 
 * Vector 
 * 		legacy 1.0   				Nonlegacy 1.2
 * 	itr+litr + enumration			itr/litr
 * 		synchronized				non-sync
 * 		multithread --good			singlethread -- good
 * 		doubles the size			cp+(cp>>1)
 * 		constructor with fillratio	fill ration is not in developers hand which is bydefault 100% 
 *		4							3
 *
 *ltr vs itr vs enumration
 *
 *itr  
 *	-- single direction
 *	-- hasnext next remove
 *	-- all collection impl class can use
 *	-- read + remove
 *	--**
 *litr
 *	-- both direction
 *	-- hashnext next remove -- previous  first last
 * 	-- add, remove set
 * 	-- only list implemented classes can use
 *	
 *enumration
 *		-- single direction
 *		-- works only on legacy classes
 *			-- vector
 *			-- stack
 *			-- hashtable
 *			--properties
 *			--dictionary
 *		--
 *
 *
 *
 *
 */
public class CollectionBasics4 {

	public static void main(String[] args) {
		List<Integer> listOfNumber = new LinkedList<Integer>();
		listOfNumber.add(10);
		listOfNumber.add(20);
		listOfNumber.add(30);
		listOfNumber.add(40);
		//CollectionBasics3.printArrayListElements(listOfNumber);
		
		Vector<Integer> vectorElements= new Vector<>();
		vectorElements.add(102);
		vectorElements.add(1432);
		vectorElements.add(52);
		vectorElements.add(602);
		vectorElements.add(172);
		
		Iterator<Integer> itr = vectorElements.iterator();
		ListIterator<Integer> listItr = vectorElements.listIterator();
		Enumeration<Integer> enumrs = vectorElements.elements();

		System.out.println("vector elements using iterator");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("vector elements using Listiterator");
		while(listItr.hasNext()){
			System.out.println(listItr.next());
		}
		
		
		System.out.println("vector elements using Enumaration");
		while(enumrs.hasMoreElements()){
			System.out.println(enumrs.nextElement());
		}
		
		
		Stack<Integer> stackNums1 = null;
		Stack<Integer> stackNums2 = new Stack<>(); // LIFO   FILO
		/*stackNums.add(10);
		stackNums.add(10);
		stackNums.add(10);
		stackNums.add(10);
		*/
		
		//add/Push/Pop
		
		//methods of stack with one liner explaination
		
		
		/**
		 *fail safe  vs fail fast
		 */
		
		
	}
	
	

	
	
	
	
	
}






