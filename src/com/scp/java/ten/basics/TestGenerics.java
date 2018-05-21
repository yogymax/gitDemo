/*package com.scp.java.ten.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
*//**
 * 
 * Unbound/NoBound  -- 	List <?> l = new ArrayList()
 * LowerBOund --  -- 	List <? super Integer> l = new ArrayList()
 * UpperBound -- 		List <? extends Integer> l = new ArrayList()
 * Row Type  -- 		List l = new ArrayList()
 * 
 * 
 * 
 * 
 *
 *//*

class TestGenerics{
	
	public static void main(String[] args) {

		
		
		Container<Number> num1 = new Container<>();
		Container<Integer> num2 = new Container<>();
		Container<Object> num3 = new Container<>();
		Container<Double> num4 = new Container<>();
		Atype.m1(num1);
		Atype.m1(num2);
		Atype.m1(num3);
		Atype.m1(num4);

		
		Container<P1> p1= new Container<>();
		Container<P2> p2= new Container<>();
		Container<Parent> p3= new Container<>();
		
		Atype.m2(p1);
		Atype.m2(p2);
		Atype.m2(p3);
		//Object o = new Object();
		//Atype.m2(o);

		
		Atype.m3(p1);
		Atype.m3(p2);
		Atype.m3(p3);
		
		
		Atype.m4(p1);
		Atype.m5(p1);
		Atype.m4(p3);
		Atype.m5(p3);

		Atype.m4(p2);
		Atype.m5(p2);

		Atype.m4(p1);
		Atype.m5(p1);
		
		List<?> list1 = new ArrayList<>();
		list1.add(p1);
		List list2 = new ArrayList<>();
		list2.add(p1);
		
		
		
		
	}
	
	
}


class Atype{
	public static void m1(Container<? extends Number> num){  //Number n tyache childs
	}
	
	public static void m2(Container<? super P1> num){ //p1 and tyache parent 
	}
	
	public static void m3(Container<? extends Parent> num){ //container of type parent 
	}
	
	
	public static void m4(Container<?> num){ //container of type parent 
	}
	
	
	public static void m5(Container num){ //container of type parent 
	}
}


interface Parent{
	void m1();
}

class P1 implements Parent{

	@Override
	public void m1() {
		System.out.println("inside p1");
	}
	
}

class P2 implements Parent{
	@Override
	public void m1() {
		System.out.println("inside p2");
	}	
}






*//**
 * Generics -- 1.5
 * 		-- Compile time Safety
 * 		-- Avoid runtime class cast exception
 * 		-- you can design generic methods/classes/interfaces/constructors
 * 
 * 
 * 	
 * 
 * 
 * int string -- extension is not allowed
 * Object object  --- extension is allowed --- type casting issue
 * generics
 * 
 * 
 * 
 * 
 *//*


class Container<Y>{
	Y i;
	Y j;
	
	
	
	public Container() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Y getI() {
		return i;
	}
	public void setI(Y i) {
		this.i = i;
	}
	public Y getJ() {
		return j;
	}
	public void setJ(Y j) {
		this.j = j;
	}
	
	public Container(Y i, Y j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		return "Container [i=" + i + ", j=" + j + "]";
	}
	
	
}

class Product{
	int productPrice;
	String productName;
	public Product(int productPrice, String productName) {
		super();
		this.productPrice = productPrice;
		this.productName = productName;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productPrice=" + productPrice + ", productName="
				+ productName + "]";
	}
	
	
	
	
}

*/