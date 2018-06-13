package com.scp.java.ten.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;



/**
 * dead -- ahe but use kart nah
 * 				-- call krtay but result use nah kart
 * 						-- exception might come
 * 				-- call ch kart nah
 * 
 * unreachable --
 * 			 due to logical condition code is not reachable
 * 			-- but you cannt remove that code
 * 			-- no not possible -- this type of code never gets executed..
 * 
 *
 */
abstract class AbstractClass{
	private int i=10;
	public void instanceMethod(int no){
		System.out.println("Inside abstract class -- "+i);
		int temp=100;
		
		
		for(int i=0;temp==no;i++){
			System.out.println("hi");
		}
		System.out.println("hello");///		
		
		int result = abstractMethod();
		
		int finalResult = 10*100;
	}
	
	private int abstractMethod(){
		System.out.println("hi");
			int i=10/0;
		
		return 10*20;
	}
	
}

class Child extends AbstractClass{
	int i=20;
	public void instanceMethod(){
		System.out.println(i);
	}
	
	public void superInstanceMethod(){
		super.instanceMethod(10);
	}
	
	
	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.i);
		c1.instanceMethod();
		c1.superInstanceMethod();
	}
	
	
	
}

public class AssociationTest {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		Emp e1 = new Emp(10,"Emp1",100);
		e1.staticMethod(); //static
		e1.instanceMethod();//instace
		e1=null;
		e1.staticMethod();//execute  Emp.staticMethod();
		e1.instanceMethod();//npe

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		Collections.unmodifiableList(numbers);
		numbers.add(10); //UnSupportedOperationException Example
		Collections.sort(numbers);//natural sorting
		
		//Collection<E>
		
		/*A -- s m1
		 *B -- s m1
		 *
		 *A a= new B()
		 *a.m1()
		 * 
		 */
		
	}

}

/*
 * 
 * 


 * 
 */


class Util{

	public static Collection getSynechronizedVersion(Collection<?> collection){
		return Collections.synchronizedCollection(collection);
		
	}
	
	
	public static Map getSynechronizedVersion(Map map){
		return Collections.synchronizedMap(map);
		
		
	}
}



/**
 * Collections.sort() -- 
 * internally uses arrays.sort
 * 		Primitive type data asel -- Dual Pivot Quicksort
 * 		Object type data -- Insertaion + merge sort = TimSort
 * 
 * 
 *  * Association
		-- Aggregation -- has a reltnship -- Loosly coupled -- Stud College -- if we seperate out the the both objects will survive
		-- Composition -- part of reltship -- Tightly Coupled -- Humanbody/ heart -- none of the object will survive
		--Inheritance -- is a relationship

 * 
 */





