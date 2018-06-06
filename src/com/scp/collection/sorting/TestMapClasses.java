package com.scp.collection.sorting;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class TestMapClasses {
	
	public static void main(String[] args) {
		Emp e1 = new Emp(14,"A1",40000);//4  "X7",16
		Emp e2 = new Emp(13,"A2",70000);//1  "X2",11
		Emp e3 = new Emp(11,"A3",60000);//2	 "X3",12
		Emp e4 = new Emp(12,"A4",50000);//3  "X6",13
		Emp e5 = new Emp(1,"A1",40000);
		Emp e6 = e5;
		
		
		
		
		
		//Hashtable<Emp,String> hTable = new Hashtable<>();
		HashMap<Emp,String> hTable = new HashMap<>();
		hTable.put(e1,"emp1");
		hTable.put(e2,"emp2");
		hTable.put(e3,"emp3");
		hTable.put(e4,"emp4");
		hTable.put(e5,"emp5");
		hTable.put(e6,"emp6");
		//hTable.put(e6,null);
		//hTable.put(null,"e7");
		
		
		Collections.synchronizedMap(hTable);
		
		//sychronizedhashmap vs hashtable  vs concurrenthashmap
		//ESYNC   BDS   BDS
		//16  11  16
		//0.75
		//null 
			//-- k -- single --no --single
			//-- v -- allowed--no --allowed
		//duplicate
			//k -- no
			//v --allowed
		
		//synch -- table level lock / table level lock / segment/bucket level 
		//slow slow fast
		//itarator -- failfast failfast failsafe
		//enumaraion --na failsafe na
		//1.2 1.0 1.5
		//nl lg nl
		
///hashmap hashtable concurrenthashmap
//arraylist array copyonarraylist
//


		
	}

}



