package com.scp.java.ten.basics;

import java.io.BufferedReader;
import java.io.FileReader;

public class ExceptionHandlingImpl {

	
	/**
	 * &&
	 * ||
	 * &
	 * |
	 * what are all parameters we should check for condition
	 * Int to String  -- different ways
	 * Stirng to int -- different ways
	 * 
	 * valueof vs toString  -- String class
	 * 
	 * nested try catch
	 * try
	 * catch
	 * finally
	 * throw
	 * throws
	 * multi-catch  -- exception seperated by pipe symbol  -- no parent child relationship
	 * multicatch -- multiple catch blocks  -- first child and then parent
	 * try with resources
	 * 
	 *
	 *
	 *
	 *
	 * @return
	 */
	public int method1(){
		
		//emoryLocan j = 50
		//Exception Deemed 30
		
		int j=20;
		try{
			j=30;
			//return j;
		}catch(Exception e){
			j=40;
		}finally{
			j=50;
		}
		
		
		return j;
		
	}
	
	
	/*
	 * try{
	 * 		
	 * st1
	 * 		try
	 * 			r 20
	 * 		catch
	 * 			r 30
	 * 		finally
	 * 			r 40
	 * return 10	
	 * 	
	 * 
	 * }catch(Exception e ){
	 * 		st7
	 * }finally{
	 * 	st8
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	/**
	 * ||
	 * &&
	 * |
	 * &
	 * 
	 * !
	 * 
	 * I
	 * 	J
	 * 		M
	 * 		N
	 * 	K
	 * 
	 * Nested try catch
	 * 
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
/*		System.out.println(new ExceptionHandlingImpl().method1());
		String line=null;
		try(
			BufferedReader b = new BufferedReader(new FileReader("C:\\Users\\abc\\Desktop\\Patterns\\demo.txt"))
			){
			while((line=b.readLine())!=null){
				System.out.println(line);
			}
		}
*/		
		
		Place p1 = new Place("Pune",12311);
		Employee e1 = new Employee("abc",10000,29,null);
		
		boolean flag=false;
		try {
			flag = verifyEmployeeDetails(e1);
		} catch (InvalidAgeException | InvalidSalary | InvalidAddressException e) {
			e.printStackTrace();
		}
		String option = flag ? "Yes" : "No";
		
		System.out.println("Employee Details are correct  :-"+option);
		
	}

	private static boolean verifyEmployeeDetails(Employee e1) throws InvalidAgeException,InvalidSalary, InvalidAddressException,Exception{

		
		if(null== e1 || e1.getAddress()==null)
			throw new Exception("Objects cannot be null");
		else if(e1.getAge()<21){
			throw new InvalidAgeException("Nabalik ahe re...!");
		}else if(e1.getEmpSalary() < 10000){
			throw new InvalidSalary("Bichara...salary kami ahe...!");
			
		}else {
			String s = String.valueOf(e1.getAddress().getPinCode());
			if(!(e1.getAddress().getCity()!=null && s.length()>=6))
				throw new InvalidAddressException("Amhi punekar...!");
		}
		
		
		
		
		/*else if(null==e1.getAddress()){
			throw new InvalidAddressException("Amhi punekar...!");
		}else{
			String v = String.valueOf(e1.getAddress().getPinCode());
			System.out.println(v.length());
			if(e1.getAddress().getCity()==null | v.length()<6){
				throw new InvalidAddressException("Amhi punekar...!");
			}
		}*/
		
	/**	
	 * if(i<10 && j>100){
	 * 	sysout(i+j)
	 * }
	 * 
	 * 
	 * 
	 * 
	 * ||  &&  -- start with first, any condition vrn outpute predict karta yet asel
	 * tr next condition execute nah kart
	 * 
	 * |  &  -- all conditions will be executed evertime 
	 * 
	 or --kinti ek true asel tr true
	  
		||      
		|
		
		&&  -- donhi true astil tr true
		&
	 */
		
		return true;
	}

	
}

/**
 * Student management
 * Emp 
 */


class Employee{
	/**
	 * POJO  -- Plain old java object
	 * Bean
	 * 
	 * 
	 * Pojo - - Asa class jo extend kinva implement karat nah dusrya class chi
	 * 	functionlity -- cannot 
	 * 
	 * bean -- can have other class functionality
	 * 
	 * 
	 * bean can be a pojo -- true
	 * 
	 */
	
	
	private String empName;
	private double empSalary;
	private int age;
	private Place address;
	public Employee(String empName, double empSalary, int age, Place address) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary
				+ ", age=" + age + ", address=" + address + "]";
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Place getAddress() {
		return address;
	}
	public void setAddress(Place address) {
		this.address = address;
	}
	
	// tostring gettersetters constuctor
	
	
	
	
	
}


class Place{
	private String city;
	private int pinCode;
	public Place(String city, int pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Place [city=" + city + ", pinCode=" + pinCode + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
}


/*If perticular class extends
 * 	-- Exception -- Checked Exception
	-- Runtime  -- Unchecked Exception
 */
	
class InvalidAgeException extends Exception{

	public InvalidAgeException(String message) {
		super(message);
	}
	
}

class InvalidSalary extends Exception {
	public InvalidSalary(String message) {
		super(message);
	}
	
}

class InvalidAddressException extends Exception {
	public InvalidAddressException(String message) {
		super(message);
	}
	
}









