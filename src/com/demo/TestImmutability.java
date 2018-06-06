package com.demo;

import java.lang.reflect.Field;
import java.util.Date;
/**
 * 
 * Immutable class with immutable fields
 * Immutbale class with Mutable field
 * 		-- mutable class is ours
 * 		-- mutable class is from third party of java -
 */



public class TestImmutability {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Vendor v1 = new Vendor("Kashmir");
		Date d1= new Date(2018,5,06);
		Fruits apple = new Fruits(160,"1KG",v1,d1);//1000
		
		System.out.println("Before change -- " +apple);
		
		//apple.getVendor().setName("Pune");
		apple.getDate().setMonth(10);
		
		System.out.println("After Change -- "+apple);
		
		
		Field[] fields= apple.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			field.set(field,"XYz");
			System.out.println("YOur class has following fields -- "+field.getName());
		}
		
		
	}

}

/**
 *
 * Immubale class with immutable fields
 *
 * Make class as final
 * var -- private final
 * Keep only getters and remove setters
 * 
 *
 * Imc -- mutable fields -- which is ours
 * 		-- mutable field -- apple above rules
 *Imc -- mutable fields -- which is from third party or java
 *
 *
 *Make sure your class should not have any of the mutable field
 * if yes -- then you need make following changes
 * 		1- IMC -- muF -- ours
 * 				-- all changes as mentioned above -- fruits -- vendor
 * 		2. IMC with muf -- third party/java
 * 				-- make sure your getter is returning a new object instead of
 * 					that objects field	
 *
 *
 */

final class Vendor{
	final String name;

	public String getName() {
		return name;
	}

	/*public void setName(String name) {
		this.name = name;
	}*/

	public Vendor(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vendor [name=" + name + "]";
	}
	
}


final class Fruits{
	final private int price; //Im //
	final private String name;//
	final Vendor vendor;//Mutable
	final Date date ;
	
	
	public Date getDate() {

		
		return new Date(date.getDate());
		//return date;
	}


	@Override
	public String toString() {
		return "Fruits [price=" + price + ", name=" + name +" : " +vendor +" : " +date +"]";
	}

	
	public Vendor getVendor() {
		return vendor;
	}




	public Fruits(int price, String name, Vendor vendor,Date dt) {
		super();
		this.price = price;
		this.name = name;
		this.vendor = vendor;
		this.date=dt;
	}



	public int getPrice() {
		return price;
	}
	/*public void setPrice(int price) {
		this.price = price;
	}*/
	public String getName() {
		return name;
	}
	/*public void setName(String name) {
		this.name = name;
	}*/
}
