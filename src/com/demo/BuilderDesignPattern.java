package com.demo;

import com.demo.Person.PersonBuilder;

public class BuilderDesignPattern {
	public static void main(String[] args) {
		Person p = new PersonBuilder("WadaPav","Waktikde").setEntertainment("TV").build();
		
		System.out.println(p);
		
	}
	
}

class Person{
	
	@Override
	public String toString() {
		return "Person [eating=" + eating + ", walking=" + walking
				+ ", coding=" + coding + ", entertainment=" + entertainment
				+ ", sleeping=" + sleeping + "]";
	}

	public Person(PersonBuilder personBuilder) {
			this.eating=personBuilder.eating1;
			this.coding=personBuilder.coding1;
			this.entertainment=personBuilder.entertainment1;
			this.walking=personBuilder.walking1;
			this.sleeping=personBuilder.sleeping1;
	}

	//mandatory
	String eating;
	String walking;
	
	//Optional
	String coding;
	String entertainment;
	String sleeping;
	
	static public class PersonBuilder{
		//mandatory
		String eating1;
		String walking1;
		
		//Optional
		String coding1;
		String entertainment1;
		String sleeping1;
		
		public PersonBuilder(String eating, String walking) {
			super();
			this.eating1 = eating;
			this.walking1 = walking;
		}

		public PersonBuilder setCoding(String code){
			this.coding1=code;
			return this;
		}
		
		public PersonBuilder setEntertainment(String ent){
			this.entertainment1=ent;
			return this;
		}
		
		public PersonBuilder setSleeping(String slp){
			this.sleeping1=slp;
			return this;
		}
		
      public Person build(){
    	  return new Person(this);
      }
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

/**
 * OuterClass
 * 		x,y -- mandatory
 * 		p,q,r -- optional
 * 
 * outerclass(Innerclass inc){
 *   this.x = inc.x;
 * 
 * 
 * Innerclass  -- static inner class 
 *    x,y -- mandatory
 * 		p,q,r -- optional
*	  
*      innerclass(xv,yv)
*      this.x=xv;
*      this.y=yv
*      
*      //repeat this for all optional properties
*      Innerclass setP(pval)
*      this.p=pval
*      return this;
*      	 
*      
*     OuterClass build(){
*      		return new OuterClass(this);
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


