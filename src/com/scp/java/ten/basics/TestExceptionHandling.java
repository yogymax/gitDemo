package com.scp.java.ten.basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;

public class TestExceptionHandling {


	/**
	 * 1#return with value  -- return 0;  -- method should have return value
	 * 2#Return without value -- retun;  -- void
	 * 
	 * 1# -- you must have one gurrentted return with value
	 * 2# -- Optional return -- but you specify return there should only one gurrentted
	 * 
	 *
	 * 
	 * 
	 * 
	 * 
	 * int m1(){
	 * try
	 * 		return
	 * catch
	 * 		return
	 * finally
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @return
	 * @throws Exception 
	 * @throws ClassNotFoundException 
	 */
	
	public static int m1(int i) throws Exception{
		
			if(i<0)
				throw new ZeroException("NOn Zero value not allowed..!");
			else if(i>100)
				throw new GreateHundredException(">100 value not allowed..!");
		return 0;
/*		try{
			System.out.println("try");
			int i=10/0;
			return 30;
		}catch(Exception e){
			System.out.println("catch");
			return 40;
		}finally{
			System.out.println("finally");
			return 50;
		}

		
		return 60;
*/		
		
	
	}
	
	
	public static void m2(){
		
		
		
		
		/**
		 *
		 * Thorw or thorws -- never handles the exception
		 * delegates repsosibility to the caller
		 * you should use this in utility methods
		 * 
		 * the code which you are writting is not only for you 
		 * but which is going to used in mutilple classes..can we say its a
		 * generic in such scenarios you should go for thorw and throws
		 *  
		 * 
		 * Throw
		 * 		-- which we write inside method
		 * 		-- always followed by exception type object
		 * 		-- ideally it should be user to throw user defined/customized excetion
		 * Throws
		 * 		-- which we write at method signature level
		 * 		-- always followed by Excetpion type classes
		 * 		-- which tells about what type of exception method may throw
		 * 		
		 * 
		 * 
		 * 
		 */
		
	
	}
	
	
	
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
	 * try catch catch catch finally  -- catch block should start with child then go to the parent
	 * try catch finally
	 * try finally 
	 * try -- 1.7 onward -- try with resources (Only thoes classes you 
	 * can write here who implemented autoclosable interface)
	 * try
	 * catch(a|B|c)  (Abc should be in parent child relationship)
	 * 
	 * try muliple - not allowd
	 * catch multiple -- allowed followed by try 
	 * finally multiple -- not allowd
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		try {
			m1(-1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		try(BufferedReader br = new BufferedReader(	new FileReader("C:\\journaldev.txt"));)
		{
			System.out.println(br.readLine());
		}
		
		
		
		/*
		
		System.out.println("outside try catch finally");*/
		
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
		//System.out.println("inside main");
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
		
		
		//System.out.println("main execution completed");
		
		
		
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

class ZeroException extends Exception{

	public ZeroException(String message) {
		super(message);
	}
}

class GreateHundredException extends Exception{

	public GreateHundredException(String message) {
		super(message);
	}
}


