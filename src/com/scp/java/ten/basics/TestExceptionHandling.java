package com.scp.java.ten.basics;

import java.io.FileNotFoundException;

public class TestExceptionHandling {

	
	/**
	 * default exception handler
	 * 		-- if exception occurs in a program which goes till main method 
	 * 	
	 * 
	 * 
	 * 
	 * 
	 * try catch
	 * try catch catch catch
	 * try catch catch catch finally
	 * try catch finally
	 * try finally 
	 * 
	 * try -- 1.7 onward -- try with resources (Only thoes classes you 
	 * can write here who implemented autoclosable interface)
	 * 
	 * 
	 * try muliple - not allowd
	 * catch multiple -- allowed followed by try 
	 * finally multiple -- not allowd
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("outside try catch finally");
		
		/*
		 * try{ //risky code }catch(Exception e){ //code to handle exception
		 * //provide options }finally{ //resource clean up activities wala code
		 * //close -- connection buffer file socket etc }
		 * 
		 * Thread stack
		 * Stack frame
		 * FILO //LIFO
		 * 
		 * every thread will have it's own thread stack
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println("inside main");
		//method1(10);
		//method5();
		
		
		/*try{
			*//**
			 * st1
			 * st2
			 * st3
			 * System.exit()
			 *//*
		}catch(Exception e){
			*//**
			 * st4
			 * st5
			 * 
			 *//*
		}finally{
			*//**
			 * st6
			 * st7
			 * s8
			 *//*
		}
		*/
		
		
		System.out.println("main execution completed");
		
		
		
	}
	
	
	/**
	 * AA
	 * BB
	 * AB
	 * BA
	 *
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	

	/*private static int methodWithReturnScenarios() {
		try{
		}catch(Exception e){
		}	
		finally{
			
		}
		
	}*/

	private static void method5() {
		System.out.println("insid method 5");
		
	}

	private static void method1(int i) {
		System.out.println("inside m1");
		try{
			method2(i);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("m1 completed");
	}

	private static void method2(int i) {
		System.out.println("inside m2");
		method3(i);
		System.out.println("m2 completed");
	}

	private static void method3(int i) {
		System.out.println("inside m3");
		int result =0;
		result = i / 0;
		System.out.println("Result =" + result);
		System.out.println("m3 execution completed..");
	}

}

/**
 * unwanted events/conditions which distrub normal flow execution
 * 
 * 
 * Exception - Can be handled programmatically Error -- cannot be handled
 * programmtatically
 * 
 * Runtime
 * 
 * 
 * 
 * try -- try block -- riksy code -- which might throw an exception catch -- if
 * exception occurs in try block.. we write code to handle that exception inside
 * catch block and you can provide the options finally -- which executes all the
 * time -- even if exception is there or not resource clean up activities throw
 * throws
 * 
 * Finally block will be always executed even if there is exception or no exceptoin
 * however there are two scenarios in which finally block will not be 
 * executed and those are
 * 		-- User has explictily written System.exit(0)
 * 		-- error inside try /catch
 * 
 * 
 * 
 * 
 * 
 * 
 */
