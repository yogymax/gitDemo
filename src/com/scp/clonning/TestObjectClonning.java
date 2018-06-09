package com.scp.clonning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.apache.commons.lang.SerializationUtils;

public class TestObjectClonning {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
/**
 * 
 * Clonning
 * 		-- Shallow
 * 		-- Deep
 * 
 * 
 * Ways to achieve
 * 		-- Using clone method of an object class by overriding it into domain class
 * 		-- Using Copy Constructor -- constrcutor which accepts same type of parementer as your class name
 * 		-- Using Deserialization
 * 		-- Third party implementation -- using apache commons
 * 				--https://mvnrepository.com/artifact/commons-lang/commons-lang/2.6
 * 				-- Right click on project -- build path -- Configure Build path -- Select Libraries Tab
 * 					-- Add External jar -- point to to the location where you have downloaded.
 * 					
 * 
 * 
 * 
 * List out all immutable classes in java
 * Why do we need object cloning
 * What will happen of composite object is of type wrapper / primitive /user defined type /string /array
 * why string is immutable
 * Advantages of immutablity
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
 * 
 * 
 * 
 * 
 * 
 */
		

		Emp e1= new Emp(10,"emp1",new Address(101010,"Mumbai"));
		System.out.println("Apache Commons");
		Emp empCloned = (Emp) SerializationUtils.clone(e1);
		
		System.out.println("------------Using deserizalization------------------");
		//Serialize -- OOS (FOS)  FOS(file) == Writeobject
		//DSerialize -- OIS (FIS)  FIS(file)== readobject
		//Emp e1= new Emp(10,"emp1",new Address(101010,"Latur"));
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e2 = (Emp)ois.readObject(); // Clonning an object using deserization
		ois.close();
		fis.close();
		
		
		System.out.println(e1==e2);
		
		System.out.println("--------------Using Copy Constructor -----------------");
		//parent -- x y -- parent(parent)  parent()
		//child -- x y z -- child(child) -- child()
		
		Child c= new Child();
		c.x=10;
		c.y=20;
		c.z=30;
		Parent p1 = new Parent();
		p1.x=10;
		p1.y=20;
		
		
		Parent clone = c;
		Parent cloned = new Child(c);
		Parent cloned2 = new Parent(p1);
		
		
		
		System.out.println("---------------Using clone method--------------------");
		Address ad = new Address(411057,"Pune");
		Emp emp1 = new Emp(10,"Abc",ad);
		Emp emp2 = emp1.clone();

		System.out.println(emp1==emp2);//false
		System.out.println(emp1.getEmpId()==emp2.getEmpId());//true
		System.out.println(emp1.getEmpName()==emp2.getEmpName());//true
		System.out.println(emp1.getEmpName().equals(emp2.getEmpName()));//true -- content equality  -- which is been overriedn inside string class
		
		System.out.println(emp1.getEmpAddress()==emp2.getEmpAddress());//false
		
		System.out.println(emp1.getEmpAddress().getCity()==emp2.getEmpAddress().getCity());//true
		System.out.println(emp1.getEmpAddress().getCity().equals(emp2.getEmpAddress().getCity()));//true
		System.out.println(emp1.getEmpAddress().getPinCode()==emp2.getEmpAddress().getPinCode());//true
		
		
		emp1.getEmpAddress().setPinCode(111111);
		emp1.getEmpAddress().setCity("Mumabai");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		
		
		
		/*System.out.println("after modifications");
		emp1.setEmpName("pqr");
		emp1.setEmpId(20);
		
		System.out.println(emp1==emp2);//false
		System.out.println(emp1.getEmpId()==emp2.getEmpId());//false
		System.out.println(emp1.getEmpName()==emp2.getEmpName());//false
		System.out.println(emp1.getEmpName().equals(emp2.getEmpName()));//false
		*/
		
		
		
	}
	
}

/**
 *LOMBOK -- jar --  
 *
 */
class Emp implements Cloneable, Serializable{
	private int empId;
	private String empName;
	private Address empAddress;
	public Emp clone() throws CloneNotSupportedException{
		Emp shallowClonned = (Emp)super.clone();
		/*Address ad1 = shallowClonned.getEmpAddress();
		Address ad2 = ad1.clone();
		shallowClonned.setEmpAddress(ad2);*/
		return shallowClonned;
		
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
	public Address getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	public Emp(int empId, String empName, Address empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "\n Emp [empId=" + empId + ", empName=" + empName + ", empAddress="
				+ empAddress + "]";
	}

	
	
	
}


class Address implements Cloneable,Serializable{
	
	//private State state;
	
	@Override
	public Address clone() throws CloneNotSupportedException {
		return (Address)super.clone();
		/*
		 * 
		 * Address clonnedAddress = (Address)super.clone();
		 * State clonnedState = clonnedAddress.getState().clone();
		 * clonnedAddress.setState(clonnedState);
		 * return clonnedAddress;
		 * 
		 */
		
		
		
	}
	private int pinCode;
	private String city;
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "\nAddress [pinCode=" + pinCode + ", city=" + city + "]";
	}
	public Address(int pinCode, String city) {
		super();
		this.pinCode = pinCode;
		this.city = city;
	}
	
}


class Parent{
	public int x;
	public int y;
	
	public Parent(Parent p){
		this.x=p.x;
		this.y=p.y;
	}

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
class Child extends Parent{
	public int z;
	public Child(Child c) {
		super(c);
		this.z=c.z;
	}
	public Child() {
		// TODO Auto-generated constructor stub
	}
	
	
}








