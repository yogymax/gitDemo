package com.scp.immutable;

import java.util.ArrayList;
import java.util.Arrays;

public class TestObjectImmutability {
	
	public static void main(String[] args) {
/*		final List<Integer> listOfNums = Arrays.asList(12,4312,4,12,4,5,6,7,23,12);
		listOfNums.add(102);
*/		
		Vendor v1= new Vendor(101,"Pune");
		ArrayList<Integer> listOfNums = new ArrayList<>(Arrays.asList(12,31));
		final Mobile samsung=Mobile.getMobileInstance(10,12011, "Mi",v1,listOfNums);
		System.out.println(samsung);
		
		ArrayList<Integer> nums = samsung.getListOfNums();
		nums.add(10);
		nums.add(20);
		
		System.out.println(samsung);		
		
	}

}

final class Mobile{
	private final  int mobileId;// by applying final we are making it as immutbale
	private final int mobilePrice; // by applying final we are making it as immutbale
	private String modelName; //-- String is bydefault immutable
	private Vendor vendor;
	final private ArrayList<Integer> listOfNums;
	public ArrayList<Integer> getListOfNums() {
		//return listOfNums;
		return new ArrayList<>(listOfNums);
	}
	
	public String getModelName() {
		return modelName;
	}
	
	//factory method -- 
	public static Mobile getMobileInstance(int mobileId, int mobilePrice, String modelName,Vendor vendor,ArrayList<Integer>listOfNums){
		return new Mobile(mobileId, mobilePrice, modelName,vendor,listOfNums);
	}
	
	@Override
	public String toString() {
		return "\n Mobile [mobileId=" + mobileId + ", mobilePrice=" + mobilePrice
				+ ", modelName=" + modelName + ", Vendor=" + vendor + ", ListOfNums=" + listOfNums + "]";
	}



	public int getMobileId() {
		return mobileId;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}

	public Vendor getVendor() {
		return vendor;
	}

	private Mobile(int mobileId, int mobilePrice, String modelName,Vendor vendor,ArrayList<Integer> listOfNums) {
		super();
		this.mobileId = mobileId;
		this.mobilePrice = mobilePrice;
		this.modelName = modelName;
		this.vendor= vendor;
		this.listOfNums=listOfNums;
	}
	
}


final class Vendor{
	final private int vendorId;
	final private String vendorAddress;
	public Vendor(int vendorId, String vendorAddress) {
		super();
		this.vendorId = vendorId;
		this.vendorAddress = vendorAddress;
	}
	public int getVendorId() {
		return vendorId;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	@Override
	public String toString() {
		return "\nVendor [vendorId=" + vendorId + ", vendorAddress="
				+ vendorAddress + "]";
	}
}


/**
 *Immutable -- class should not be changed..not a single field --nothing but read only
 *Thread safety -- If classs is an immutable then that is bydefault thread safe
 *hashmap --  keys -- withing an single exeuction of an application-- hashcode of an object should remain same
 *	as long as you are not modifying the hashcode and equals method...
 *
 *how to make class as immutable
 *Immutable with immutable fields
 *		-- make a class final -- 
 *		--make all methods present inside class -- final
 *		-- remove setters--keep only getters
 *		--make constructor as private--
 *		-- all variable of a class should be -- private and final
 * 
 *Immutable class with mutable field
 *		1. immutable class with mutable field-- mutable field is ours
 *			Mobile	
 *					-- class final
 *					-- fields -- private and final
 *					-- only getters 
 *					-- all methods are final as you already declared class as final
 *					-- Constructor private -- we have created factory method produces objects of
 *						mobile type -- by calling private constrcutor--single entry to create a mobile type of objects
 *			Vendor
 *				-- same things that we did for mobile 
 *		2. immutable class with mutable field-- mutable field is third party/java defined 
 *        Mobile	
 *					-- class final
 *					-- fields -- private and final
 *					-- only getters 
 *					-- all methods are final as you already declared class as final
 *					-- Constructor private -- we have created factory method produces objects of
 *						mobile type -- by calling private constrcutor--single entry to create a mobile type of objects
 *			Date/Arraylist
 *					-- make sure your getter of that type is returning new object instead of actual
 *					final private ArrayList<Integer> listOfNums;
						public ArrayList<Integer> getListOfNums() {
						//return listOfNums;
						return new ArrayList<>(listOfNums);
						}
						
 *
 *
 *
 * 	-- final instance var  
 * 				1. at the time declaration
 * 				2. inside constructor  -- blank final field
 * 				3. Instance block  -- blank final field
 *   -- final static var
 *   		1. at the time of declaration
 *   		2. inside static block
 *   		
 * static var --
 * 			-- static/instance block -- at the time of declaration -- inside constrcutor (ideally shouldn't be)
 * 				static /instance methods
 * 	instance var --
 * 			--  instance block -- at the time of declaration -- inside constructor -- instance method
 * 				static block (but you need obj ref -- which ideally should not be iniliazed)
 * 				static method -- obj ref required.
 *
 */


class Container{
	public int x=10;
}
