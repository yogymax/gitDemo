package com.scp.seleniun.third;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		System.out.println("inside main method");
		m1();//
		m4();//main and m4
		System.out.println("main method execution completed");
		
	}

	private static void m4() {
		System.out.println("inside m4");
	}

	private static void m1() {
		System.out.println("inside m1 method");
		try {
			m2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("m1 execution compelted");
	}

	private static void m2() throws Exception {
		System.out.println("inside m2 method");
		int result = m3();
		System.out.println(result);
		System.out.println("m2 execution completed");
	}

	private static int m3()  throws Exception{
		System.out.println("inside m3 method..");
		int i=0;
		
		if(i==0){
			throw new Exception("Zero value is not allowed");
		}else if(i<0){
			throw new Exception("+ve value is not allowed");
		}else if(i>=101){
			throw new Exception(" value is not allowed");
		}else
			return i;
		
		
		
		//return 50;//un
	}
	
	/**
	 * 
	 * Both are events or conditions which terminates the normal flow of your prog execution
	 * 
	 * Exception -- we can handle it programmatically
	 * 
	 * try
	 * catch
	 * finally
	 * throw
	 * throws
	 * 
	 * 
	 * Error  -- cannot be handled
	 * 
	 * you can handle the excetion only thru try and catch -- other keywords will give additional
	 * capabilities but will never handles the exections 
	 * 
	 * If exception is not handled in a code and goes till main method that main method
	 * will print entire stacktrace -- message/which method/line no -- on console
	 * this is nothing but default exeception handling mechanism -- in this case execution is not a normal one
	 * 
	 * 
	 *
	 * Exception handling return scenrios
	 * 
	 * 
	 * try block
	 * 		-- Risky code -- which might throw an exception
	 * Catch Block --
	 * 		 -- code to handle the exception and print stacktrace
	 * 		-- you can provide an options
	 * 
	 * finally
	 * 		--resource clean up 
	 * 		--Always get executed except two scenarios
	 * 				1. If use is explictly asking for prg termination -- System.exit()
	 * 				2. try or catch madhe -- error ala
	 * 
	 * 
	 * 
	 * try -- catch
	 * try -- catch -- catch-- catch--
	 * try--finally 
	 * try-- catch--catch--catch--finally
	 * try--catch--finally
	 * try (try with resources) -- 1.7
	 * 
	 * 
	 * 
	 * 				
	 * 
	 * try -- ngr
	 * catch -- ngr
	 * finally -- gr
	 * try --catch -- gc
	 * try--catch--finally --gc
	 * 
	 * throw
	 * 		-- inside method
	 * 		 -- always followed by exception type of object
	 * 		-- to throw an exception/ to delegate the exception to the caller
	 * 		-- callers responsibilty to handle the exception 
	 *  throws
	 *   -- at method signature level
	 *  -- always followed by exception type of classes
	 * -- throws tells which type of execeptions your method might throw
	 * throw and throws -- ideally we should use to deal with user defined execeptions
	 * 
	 * checked vs unchecked 
	 * 
	 * 
	 * 
	 */

}
