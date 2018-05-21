/*package com.scp.java.ten.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class GenericsTest {

	
	
	
	
	public static void main(String[] args) {
	
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,7);
		
		nums.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		});
		
		System.out.println();
		nums.forEach(n -> System.out.print(n));
		
		System.out.println();
		nums.forEach(System.out::print);

		nums.forEach(\);
		
		
		
		
		
		
		System.out.println("other output");
		
		Box<String,Integer> box1 = new Box<>();
		box1.item1="Mangoes";
		box1.item2=40;
			
		
		Parent<String> p = new Parent<>();
		Child<String> c = new Child<>(); 
		p=c;
		
		
		Parent<Number> p1 = new Parent<>();
		Child<Integer> c2 = new Child<>(); 
		//p1=c2;
		
		
		
		
		
//Type Safety -- compile type so that there is no classcast exception at runtime
		
		
		String str = box1.getItem1();
		int qty = box1.getItem2();
		
	//	String type = box2.getItem1();
		//String dozones = box2.getItem2();
		
*//**
 * Class -- Method -- Interface  -- constructor
 * Bt nt possible for variables
 *//*
		
		
	}
	
}


*//**
 * 
 * 1. Parent Normal -- and child generic -- Directly allowed
 * 2. Parent generic type -- child normal -- not possible 
 * 			-- u shud have same type of generic 
 * 			-- you can have many but should satify parent generic 
 * 3. Same constrctor chaining rule is applicable as we have in objects
 * 		-- u have to navigate till object class
 * 4. If parent is of type class and interface then child should 
 * 			--extend first then implement
 * 			-- make sure all parent type generics you have specificed in child class type
 * 
 * 			interface I1<T1>
 * 			inteface I2<T2,T3>
 * 			class Parent<T4>
 *			class Child<T1,T2,T3,T4> extends Parent<T4> implements I1<T1>,I2<T2,T3> 
 * 			class Child<A,C,T1,T2,T3,T4> extends Parent<T4> implements I1<T1>,I2<T2,T3>
 * 		
 *5. Predefined generic type rule
 *		 class A
 *		 class Parent<A>			
 * 		 class Child extends Parent<A>  -- allowed
 * 		
 * 		 class Parent<T>			
 * 		 class Child extends Parent<T>  -- Not -allowed -- child should have same type of generic
 * 			
 * 		in first scenrio A is predefined but in second T not
 * 
 * 6. Raw type rule
 * 		class A<T>
 * 		class B extends A  -- allowed as A is of raw type
 * 7. Boundwala rule
 * 		class A <T extends Number>
 * 		class B 
 * 
 * 8.  AB in normal scenrio is allowed but not in case of generics
 * 		class P
 * 		class C extends P  
 * 		p=c (will work without an issue)
 * 
 * 		List<P> l1 = new Arraylist();
 * 		List<C> l2 = new Arraylist();
 * 		l1=l2 (Compile time error)
 *
 *//*



class Parent<T>{
	
}

class Child<T> extends Parent<T>{
}












class ChildCBox<T> implements ParentIBox<T>{
	T item1;
	
	public ParentCBox(T item1) {
		super(item);
		this.item1 = item1;
	}

	@Override
	public void typeOfBox() {
		// TODO Auto-generated method stub
		
	}
	
}


*//**
 * 1. Generic child can extend normal parent class/interface
 * 2. parent generic type, following childs are allowed
 * 		-- same generics type for child (even no)
 * 				class A<T>
 * 				class B<T> extends A<T>
 * 		-- atleast same no of generics should be their for child class
 * 				class A<T>
 * 				class B<T,A,C> extends A<T> (sequece doesnt matter)
 * 		-- parent of generic type and child of same of but with differnt generic
 * 				class A<T>
 * 				class B<T1> extends A<T> (Compile time error)
 * 				class B<T1,A,C> extends A<T> (Compile time error)
 * 	
 * 
 * 
 *
 * @param <T>
 *//*


class Aa<T>{

	public <S>Aa(S a) {
		super();
	}
	
	
}

interface Ba<T>{
	
}



class Xa <T extends Aa & Ba>{
	
}




class Box<S,T> {
	S item1;
	T item2;
	
	public S getItem1() {
		return item1;
	}
	public void setItem1(S item1) {
		this.item1 = item1;
	}
	public T getItem2() {
		return item2;
	}
	public void setItem2(T item2) {
		this.item2 = item2;
	}
	@Override
	public String toString() {
		return "Box [item1=" + item1 + ", item2=" + item2 + "]";
	}

	public void m1(){
*//**
 * Why Generics when its been added in java
 * rowtype vs Unbound
 * Upper bound vs Lower Bound vs Unbound
 * generics inheritance and subtyping rules --#
 * when to use upper bound over lower bound and vice versa
 * https://www.wisdomjobs.com/e-university/java-generics-interview-questions.html
 * 
 * write a generics class
 * write a generic method
 * 
 * class A<T>
 * public <T1>void m1(T1 t)
 * public <T2>T2 m1(T1 t)
 * public <T> A<T>()
 * inteface I1<X>
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *//*
		
		
	}
	
}
class BB extends Aa implements{
	Comparable<T>
}
*/