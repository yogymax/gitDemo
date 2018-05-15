package com.scp.java.ten.basics;

import java.util.Arrays;

public class TestStringConstantPool {
	
	/**
	 * 
	 * What is scp
	 * What is java memory model explain every component with example
	 * What gets stored
	 * 		-- method area
	 * 		--heap
	 * 		-- thread stack
	 * 		-- pc
	 * 		-- native stack
	 * 
	 * list down object class method with one liner explanation
	 * == and Equals
	 * write down object type array and iterate it and print the contents
	 * write down equals method and explain each and every line meaning
	 * 
	 * write down java prog execution life cycle include jdk jre jvm jit responsibilities
	 * String vs final String
	 * String vs Stringbuffer vs Stringbuilder
	 * list down methods of following
	 * 		--String class
	 * 		--StringBuffer
	 * 		--Stringbuilder
	 * 
	 * 
	 *  
	 * 
	 * 
	 * String
	 * 		--immutable
	 *      -- thread safe
	 * Stringbffer
	 *     --mutable 
	 *     --thread safe
	 * 
	 * Stringblder
	 *     --mutable
	 *     --non thread safe
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	/**
	 * String StringBuffer StringBuilder
	 * 
	 * 
	 */

	
	//String s1="abc";
	
	//s1="a";
	
	
	/**
	 * 
	 * SCP -- String constant pool
	 * 
	 * Objects created with new keyword is always created on heap area
	 * and one copy is maintained scp area which heap's part
	 * 
	 * Objects created without new keyword are always created on scp area
	 * 
	 * Note -- while assigning memory on scp area check for duplicate if present
	 * point to that only or else create new one
	 * 
	 * If you modify object which is pointing to heap area will end up with 
	 * creating new object on heap and one copy on scp
	 * 
	 * 
	 * however if you modify object pointing to scp area will also does the same 
	 * thing (considering duplicate wala point) -- scp not on heap
	 * 
	 * 
	 * intern -- which will change the ref pointing from heap to scp area
	 * 
	 * 
	 * ==  ref equality
	 * equals -- object class  == ref equality
	 * wrapper classes and String class -- content equality
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Integer i=10;
		
		final String s2="pqr";
		String s1="abc";
		s1=s1.concat("a");
		
		System.out.println(s1);
		
		
		
		//String s1 = new String("PQR");
		s1=s1+"xx";
		String s5="PQRxx";
		s1=s1.intern();
		
		
		//System.out.println(s1.equals(s5));
		//System.out.println(s1==s5);
		/*System.out.println(s1==s2); //False
		System.out.println(s3==s4); //True
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s3.equals(s4)); //true
		
		String s5 ="PQR";
		s1=s1.intern();
		System.out.println(s5==s1);
		*/
		
		//Stud stud1 = new Stud(10,"S1");//1000
		//Stud stud2 = new Stud(10,"S1");//2000
		//Stud stud3=stud1; //1000
/*		
		System.out.println(stud1.equals(stud2));//False
		System.out.println(stud1.equals(stud3));//T

		System.out.println(stud1);
		System.out.println(stud2);
*/
		
		A[] obs = new A[10];
		obs[0]=new A();//i=10
		obs[1]=new B();//i=10, j=20
		obs[2]=new C();//i=10, j=20, X=30
		obs[3]=new A();//i=10
		obs[4]=new B();//i=10, j=20
		obs[5]=new C();//i=10, j=20, X=30
		obs[6]=new A();//i=10
		obs[7]=new B();//i=10, j=20
		obs[8]=new C();//i=10, j=20, X=30
		obs[9]=new A();//i=10

		
		System.out.println(Arrays.toString(obs));
		
		for(A a :obs){
			//a.x //CE -- ref is of parent 
		if(a instanceof C){
				C c= (C)a;
				System.out.println("C's Memeber");
				System.out.print(c.i);
				System.out.print(c.j);
				System.out.println(c.x);
		}else if(a instanceof B){
			B b= (B)a;
			System.out.println("B's Memeber");
			System.out.print(b.i);
			System.out.print(b.j);
		}
		else{
			System.out.println("A's Memeber");
			System.out.print(a.i);
		}
	}
	}	
}
class A{
	int i=10;

	@Override
	public String toString() {
		return "A [i=" + i + "]";
	}
	
	
}

class B extends A{
	int j=20;

	@Override
	public String toString() {
		return "B [j=" + j + "]";
	}
	
}

class C extends B{
	int x=30;

	@Override
	public String toString() {
		return "C [x=" + x + "]";
	}
	
}




class Stud{
	
	@Override
	public String toString() {
		return "Stud [studId=" + studId + ", studName=" + studName + "]";
	}

	int studId;
	String studName;
	
	public Stud(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studId;
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
		Stud other = (Stud) obj;
		if (studId != other.studId)
			return false;
		if (!studName.equals(other.studName))
			return false;
		return true;
	}
	
}













