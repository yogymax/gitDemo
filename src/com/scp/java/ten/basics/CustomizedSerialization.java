package com.scp.java.ten.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizedSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p1 = new Person("A","PUne", 1121);
		File file = new File("C:\\Users\\Yogesh\\Desktop\\Serialization\\cust.txt");

		System.out.println("Pre-serilization --" +p1);
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
		oos.close();
		fos.close();
		
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person e3 = (Person)ois.readObject();
		
		System.out.println("Deserilization --" +e3);
		
		
		
	}
}



class Person implements Serializable{
	String name;
	String address;
	transient int atmPin;
	
	
	@Override
	public String toString() {
		return "\n Person [name=" + name + ", address=" + address + ", atmPin="
				+ atmPin + "]";
	}

	public Person(String name, String address, int atmPin) {
		super();
		this.name = name;
		this.address = address;
		this.atmPin = atmPin;
	}
	
	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject(); // Name --Y  Address- Pune  atmpin-0

		System.out.println("At the time of WriteObject");
		System.out.println("Name --" +name);
		System.out.println("Address --" +address);
		System.out.println("AtmPin --" +atmPin);
		
		int ePin = atmPin+330; //1000+330
		System.out.println("encrypeted pin--" +ePin);
		os.writeObject(ePin);  // 1330
	}
	
	
	private void readObject(ObjectInputStream is) throws Exception{
		is.defaultReadObject();  // Y PUne 0
		System.out.println("At the time of ReadObject");
		System.out.println("Name --" +name);
		System.out.println("Address --" +address);
		System.out.println("AtmPin --" +atmPin);
		
		int pin = (int)is.readObject(); //1330
		System.out.println("before decryption" + pin);
		atmPin = pin-330;  //atmpin 1000
		System.out.println("post decyption--" +atmPin);
	}
}