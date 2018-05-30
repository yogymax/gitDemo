package com.scp.collection.cursors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

/**
 * 
 * Code explanation line by line + hashcode and equals method impltn 
 * 
 * 
 *
 */

public class CollectionIterations {

	public static void main(String[] args) {

		HashMap<Emp, String> mapOfEmps = getDummyData(10);
		System.out.println(mapOfEmps);
		String value = "Person2";
		Emp emp1= retriveKeyBasedOnValue(value,mapOfEmps);
		
		System.out.println(value +" value has a key -- " +emp1);

		
		ArrayList<Emp> listOfEmps = new ArrayList<>(getDummyList(10));
		Vector<Emp> v = new Vector<>(listOfEmps);
		LinkedList<Emp> linkedList = new LinkedList<>(listOfEmps);

		HashSet<Emp> setOfemps = new HashSet<>(getDummyData(10).keySet()) ;
		LinkedHashSet<Emp> linkedHashset = new LinkedHashSet<>(setOfemps);
		
		usingIterator(listOfEmps);
		usingIterator(v);
		usingIterator(linkedList);
		usingIterator(setOfemps);
		usingIterator(linkedHashset);
		
		
		
		
		usingListIterator(listOfEmps);
		usingListIterator(v);
		usingListIterator(linkedList);
		
		usingEnumaration(setOfemps);
		usingEnumaration(v);
		usingEnumaration(listOfEmps);
		
		
		
	}
	
	
	
	
	private static void usingIterator(Collection<Emp> c){
		System.out.println("############using Iterator"  +c.getClass() +" ############");
		Iterator<Emp> itr = c.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	private static  void usingEnumaration(Object ob){
		System.out.println("############using Enumration"  +ob.getClass() +" ############");
		
			Enumeration<Object> enumM = null;
		 if(ob instanceof Vector){
			 Vector<Object> v = (Vector<Object>)ob;
			 enumM= v.elements();
			 while(enumM.hasMoreElements()){
				 System.out.println(enumM.nextElement());
			 }
		 }else if(ob instanceof Hashtable){
			 Hashtable<Object, Object> ht = (Hashtable<Object, Object>) ob;
			 enumM= ht.elements();
			 while(enumM.hasMoreElements()){
				 System.out.println(enumM.nextElement());
			 }
		 }else{
			 System.out.println("Object cannot be iterated using enumaration as not a legacy class");
		 }
		
		 
		 
		// Stack vector hashatable properties dictionaries
	}
	
	
	private static void usingListIterator(List<Emp> list){
		System.out.println("############using ListIterator"  +list.getClass() +" ############");
		ListIterator<Emp>  itr = list.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	

	private static Emp retriveKeyBasedOnValue(String expectedValue,HashMap<Emp, String> hmap) {
		Set<Entry<Emp,String>> setOfEntries = hmap.entrySet();
		Iterator<Entry<Emp,String>> entriesItr = setOfEntries.iterator();
		while(entriesItr.hasNext()){
			Entry<Emp,String> singleEntry = entriesItr.next();
			if(singleEntry.getValue().equals(expectedValue)){
				return singleEntry.getKey();
			}
		}
		
		/*for (Entry<Emp, String> entry : setOfEntries) {
			if(entry.getValue().equals(expectedValue)){
				return entry.getKey();
			}
		}*/
		return null;
	}


	
	static private List<Emp> getDummyList(int noOfPersons){
		List<Emp> listOfEmps = new ArrayList<Emp>();
		for(int i=1;i<noOfPersons;i++){
			listOfEmps.add(new Emp(i,"Shrwan"+i));
		}
		return listOfEmps;
	}
	
	static private HashMap<Emp, String> getDummyData(int noOfPersons){
		HashMap<Emp,String> hashmap = new HashMap<>();
		for(int i=1;i<=noOfPersons;i++){
			hashmap.put(new Emp(i,"Shrwan"+i), "Person"+i);
		}
		
		System.out.println(hashmap.get(new Emp(1, "Shrwan1"))); // Person1
		
		hashmap.put(new Emp(1, "Shrwan1"),"Person21");
		hashmap.put(new Emp(8, "Shrwan8"),"Person28");
		hashmap.put(new Emp(9, "Shrwan9"),"Person29");
		
		System.out.println(hashmap.get(new Emp(1, "Shrwan1"))); // Person21
		System.out.println(hashmap.get(new Emp(8, "Shrwan8"))); // Person28
		System.out.println(hashmap.get(new Emp(9, "Shrwan1"))); // null
		System.out.println(hashmap.size()); //10
		
		return hashmap;
		
	}




}






class Emp{
	private int empId;
	private String empName;
	@Override
	public String toString() {
		return "\n Emp [empId=" + empId + ", empName=" + empName + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
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
		Emp other = (Emp) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	
	
	
	
	
}











