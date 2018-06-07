package com.scp.collection.cursors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class UseCursors {
	
	public static void main(String[] args) {
		HashSet<Integer> setOfInteger = new HashSet<>(); //content
		System.out.println(setOfInteger.add(19));//true
		System.out.println(setOfInteger.add(29));//true
		System.out.println(setOfInteger.add(123));//true
		System.out.println(setOfInteger.add(19));//false  
		System.out.println(setOfInteger.add(29)); //false
		System.out.println(setOfInteger.add(419));//true
		System.out.println(setOfInteger.add(19)); //false
		
		System.out.println("SetOfInt Size -- "+setOfInteger.size()); //4
		
		
		Laptop l1 = new Laptop(10,"Lenovo");//true
		Laptop l2 = new Laptop(131,"HP");//true
		Laptop l3 = new Laptop(13,"Dell");//true
		Laptop l4 = new Laptop(131,"Mac-Mini1");//false
		Laptop l5 = new Laptop(112,"Mac-Mini2");//true
		Laptop l6= l3;//false
		
		HashSet<Laptop> setOfLaptops = new HashSet<>(); 
		setOfLaptops.add(l1);
		setOfLaptops.add(l2);
		setOfLaptops.add(l3);
		setOfLaptops.add(l4);
		setOfLaptops.add(l5);
		setOfLaptops.add(l6);
		
		System.out.println("SetOfLaptops Size -- "+setOfLaptops.size());//4
		
		
		/**
		 * Hashset set-- integer
		 * set.iterator -- Iterator<integer>
		 * 			hasnext  -- ahet
		 * 			next //
		 * 
		 */
		
		//setOfInteger -- has integers -- cursor iterator -- Iterator <Inter>
	
		System.out.println("using iterator -- int");
		
		Iterator<Integer> setItr = setOfInteger.iterator();
		
		
		while(setItr.hasNext()){
			System.out.println(setItr.next());
		}
		
		System.out.println("using iterator -- lappy");
		Iterator<Laptop> lappyItr = setOfLaptops.iterator();
		while(lappyItr.hasNext()){
			System.out.println(lappyItr.next());
		}
		
		
		
		Vector<Laptop> lappyVector = new Vector<>();
		lappyVector.add(l1);
		lappyVector.add(l2);
		lappyVector.add(l3);
		lappyVector.add(l4);
		lappyVector.add(l5);
		lappyVector.add(l6);
		
		System.out.println("vector iteration using iterator");
		

		
		/**
		 * Generic way to interate collection classes
		 * get value based key from hashmap
		 * 
		 * 
		 */
		
		Iterator<Laptop> vectorItr = lappyVector.iterator();
		while(vectorItr.hasNext()){
			System.out.println(vectorItr.next());
		}
		
		System.out.println("vector iteration using ListIterator");
		ListIterator<Laptop> vectorListItr = lappyVector.listIterator();
		while(vectorListItr.hasNext()){
			System.out.println(vectorListItr.next());
		}
		
		System.out.println("vector iteration using Enumaration");
		Enumeration<Laptop> enumItr = lappyVector.elements();
		while(enumItr.hasMoreElements()){
			System.out.println(enumItr.nextElement());
		}
		
		System.out.println("using normal for loop");
		for(int i=0;i<lappyVector.size();i++){
			System.out.println(lappyVector.get(i));
		}
		
		System.out.println("using foreach loop");
		for(Laptop item :lappyVector){
			System.out.println(item);
		}
		
		
		System.out.println("not mandatory right now...J8 -- Lambda -- function interfaces");
		/*lappyVector.forEach(System.out::println);
		lappyVector.forEach(item -> System.out.println(item));
		lappyVector.forEach((p) -> System.out.println(p));
		lappyVector.forEach(new Consumer<Laptop>() {
			@Override
			public void accept(Laptop t) {
				System.out.println(t);
			}
		});
		*/
		
		
		System.out.println("Hashmap Iterations");
		
		
		
		/**
		Laptop l1 = new Laptop(10,"Lenovo");//true
		Laptop l2 = new Laptop(131,"HP");//true
		Laptop l3 = new Laptop(13,"Dell");//true
		Laptop l4 = new Laptop(131,"Mac-Mini1");//false
		Laptop l5 = new Laptop(112,"Mac-Mini2");//true
		Laptop l6= l3;//false

		 * 
		 */
		HashMap<Laptop,String> hmap = new HashMap<>();
		hmap.put(l1,"X1"); //null
		hmap.put(l2,"X2"); //null
		hmap.put(l3,"X3"); //null
		hmap.put(l4,"X4"); //X2
		hmap.put(l5,"X5"); //null
		hmap.put(l6,"X6"); // x3
		
		// l1|x1 , l2|x4 , l3|x6 , l5|x5
		
		System.out.println("HashMap size -- "+hmap.size());
		System.out.println("Hashmap  Contents --"+hmap);
		
		
// List<X>/Set/Vector  -- iterator -- Iterator<x>
		
		
/**
 * 
 * List
 * Vector
 * Set
 * LinkedList
 * hashet
 * 
 * hashmap
 * 		keyset  --5
 * 		entryset  -- 5
 * 		value  - 1
 * s
 * 
 * for
 * foreach
 * iterator
 * listiterator
 * enumaration
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
		
		
		Set<Laptop> setOfKeys = hmap.keySet();
		Iterator<Laptop> itrK = setOfKeys.iterator();
		while(itrK.hasNext()){
			Laptop lapIskey = itrK.next();
			String value = hmap.get(lapIskey);
			System.out.println("Key -- "+lapIskey + " Value  --" +value);
		}
		
		Collection<String> valueCollection = hmap.values();
		List<String> listOfStr = new ArrayList<String>(valueCollection);
		Iterator<String> itrStr = listOfStr.iterator();
		while(itrStr.hasNext()){
			System.out.println(itrStr.next()); //
		}
		
		
		Set<Entry<Laptop,String>> setOfEntries = hmap.entrySet();
		Iterator<Entry<Laptop,String>> entryItr = setOfEntries.iterator();
		while(entryItr.hasNext()){
			Entry<Laptop,String> entry = entryItr.next();
			System.out.println("Key -- " +entry.getKey());
			System.out.println("Value -- " +entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Iterator
				-- all collection implemented classes vr chalto
					Iterator <Type> itr = set.iterator();
					hasnext next remove
					forword direction
					only remove and read
		ListIterator
					-- list implmeneted classes vr only
						forward + backword
						hasnext next remove + set add -- prev lastindex
						read/add/update/delete
		Enumaration
					-- only legacy classes (1.0)
					-- Stack
						vector
						hashtable
						properties
						Dictionaries
						elements
						hasmoreelements
						nextElement
						ReadOnly Cursor
						
						*
						*
						*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}


class Laptop{
	
	private int id;
	private String name;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}
