package com.scp.java.ten.basics;


public class ExceptionRethrow {

	
	public static void main(String[] args) throws InvalidJ {
	
		ExceptionRethrow e = new ExceptionRethrow();
		try {
			e.m1(0);
		} catch (InvalidJ e1) {
				e.m1(10);
		}	
	}
	
	public void m1(int i) throws InvalidJ{
		System.out.println("inside m1");
		m2(i);
		System.out.println("m1 execution completed");
	}
	
	public void m2(int i) throws InvalidJ{
		System.out.println("inside m2");
		m3(i);
		System.out.println("m2 execution completed");
	}
	
	public void m3(int j) throws InvalidJ {
		System.out.println("inside m3");
		int [] num =new int[5];
		try{
			num[5]=10/j;
			
		}catch(Exception e){
			if(e.getMessage().equals("/ by zero")){
				throw new InvalidJ("Invalid J value -- should not be zero");
			}else
				e.printStackTrace();	
		}
		
		
		
		System.out.println("m3 execution completed");
	}
	
	
	/**
	 * rethrow -- catch the exception first and based on condtion throw it
	 * catch -- handle the execution for smooth functionlity
	 * 
	 * 
	 * throw  -- 
	 * throws -- 
	 * 
	 * 
	 * 
	 */
	
}

class InvalidJ extends Exception{

	public InvalidJ(String message) {
		super(message);
	}
	
}

