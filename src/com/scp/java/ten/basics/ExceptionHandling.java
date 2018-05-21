package com.scp.java.ten.basics;

public class ExceptionHandling {
	/**
	 * 
	 * Generics and multithreading and Queue java8
	 * 
	 * Enum
	 * 
	 * 
	 * https://github.com/yogymax
	 * 
	 * 
	 * try - to write risky code
	 * catch  - to handle exception or to provide options
	 * finally  -resource cleanup activities
	 * throw  -- to throw an excetion from method -- to delegate the exception
	 * 			handling repsonsibility
	 * throws  -- all exception that method can throw
	 * 
	 * 
	 * try with return
	 * try catch finally
	 * try catch|catch|
	 * try with resources
	 * 
	 * Customized Exception /User Defined exception
	 * 
	 * Checked --(5)
	 * unchecked (5)
	 *
	 * exception hierarchy
	 * 
	 * checked vs unchecked
	 * throw vs thorws
	 * 
	 * can we write throwable instead of exception ? what happens..ideally 
	 * shall we use that
	 * 
	 * Default exception handler
	 * 
	 * Checked Exception Method overriding rule
	 * 
	 * What gets printed on console when exception comes
	 * 
	 * differment methoods of exception 
	 * 		e.printStackTrace();
			e.getCause();
			e.getMessage();
			e.getLocalizedMessage();
			e.getStackTrace();
			
	 * 	
	 * Enum --
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Checked  -- Compile time 
	 * 		= Excluding error + Unchecked Exception
	 * 
	 * 
	 * Unchecked  
	 * 		-- Runtime events/condition which terminates normal
	 * 			flow of an execution excluding errors
	 * 
	 * 
	 * 		Thorwable
	 * Exception	error
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		try {
			method1(-1);
		} catch (InvalidValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getCause();
			e.getMessage();
			e.getLocalizedMessage();
			e.getStackTrace();
		}
		
		
	}

	private static void method1(int i) throws InvalidValueException {
			method2(i);
		
			String s=null;
			s=s+"abc";
			System.out.println(s);
			
	}

	private static void method2(int i) throws InvalidValueException {
		if(i<=0)
			throw new InvalidValueException("nit value tak re...!");

		System.out.println(i*i);
	}
	
	
	
	
	

}


class InvalidValueException extends Exception{
	
	public InvalidValueException(String msg){
		super(msg);
	}
	
}


