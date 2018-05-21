package com.scp.java.ten.basics;

import java.util.LinkedList;
import java.util.List;
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
		CollectionBasics3.printArrayListElements(listOfNumber);
		
		
	}
}



