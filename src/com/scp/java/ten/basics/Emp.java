package com.scp.java.ten.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Emp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int empId;
	String empName;
	transient int empSalary;
	String empAddress;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Emp e1 = new Emp(10,"Abcd",12121);
		Emp e2 = new Emp(12,"AAAA",11111);
		File filea = new File("C:\\Users\\Yogesh\\Desktop\\Serialization\\sera.txt");
		File fileb = new File("C:\\Users\\Yogesh\\Desktop\\Serialization\\serb.txt");
		/*FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e3 = (Emp)ois.readObject();
		Emp e4 = (Emp)ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println(e3);
		System.out.println(e4);
		*/
		
		/*A a = new A();
		FileOutputStream fos = new FileOutputStream(filea);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a); //i=10
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(filea);
		ObjectInputStream ois = new ObjectInputStream(fis);
		A aOb = (A)ois.readObject();
		ois.close();
		fis.close();
		System.out.println("Parent -- "+aOb);
*/
		
/*		B b = new B();		
		FileOutputStream fos2 = new FileOutputStream(fileb);
		ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
		oos2.writeObject(b); //i=10 j=20
		oos2.close();
		fos2.close();
		
		FileInputStream fis2 = new FileInputStream(fileb);
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		B bOb = (B)ois2.readObject();
		ois2.close();
		fis2.close();
		System.out.println("Child -- "+bOb);
*/	}

	
	
	@Override
	public String toString() {
		return "\n Emp [empId=" + empId + ", empName=" + empName + ", empSalary="
				+ empSalary + "]";
	}

	public Emp(int empId, String empName, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	
}
/**
 * 
 * Exception in thread "main" java.io.InvalidClassException:
 *  com.scp.java.ten.basics.Emp; local class incompatible: 
 *  stream classdesc serialVersionUID = -9172436014111692610,
 *  local class serialVersionUID = 581713448768913325
 * 
 * 
 */







