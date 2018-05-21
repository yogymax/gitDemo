package com.scp.java.ten.basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLoopingConcepts {

	/*public void m1(int i){
		System.out.println("int");
	}*/
	
	
	
	
	public static void main(String []a) throws Exception{
		System.out.println("byte");
		
		try(
				FileReader freader = new FileReader("C:\\Users\\abc\\Desktop\\Patterns\\demo.txt");
				BufferedReader reader = new BufferedReader(freader);){
			
			if(freader.read()==-1){
				throw new Exception("File has no contents..");
				
			}else{
				String line =null;
				while((line=reader.readLine())!=null){
					System.out.println(line);
				}
			
			}		
			
		}
		
	}
	
	public void method3(){
	}
	/*public static void main(String[] args) {
		TestLoopingConcepts t = new TestLoopingConcepts();
	}*/
	
}

/**
 * There are 3 types of looping concepts
 * 	1. Selective
 * 			if..else  
 * 					-- if should be at first line can be followed by else if or else
 * 					-- If if..else if and else your are going to use.. else should be at last and else if can be in middle where as if at the top
 * 					-- if() -- any valid java statement whose return type is boolean is allowed
 * 					-- curly braces are optional however only single line will be inside the loop
 * 					 and that should not be declarative statement
 * 					-- if...else , if ..else if, if...else, if ...else if..else, if...else if..else if..else if....,if...else if..else if..else if....else
 * 						(many can only else if not only if or else)
 * 
 * 			switch
 * 					-- If there are multiple if..else if conditions,and you 
 * 			considering applicatio performance than java coding convetion says
 * 			you should use switch
 * 				-- curly braces are mandatory
 * 				-- case labels should not be duplicate	
  				-- Case labels and user choice datatypes should be same
  				-- User Choice DT Rules
  					1.4-- byte short int char
  					1.5 -- 1.4 features + Byte Short Integer Character + Enum
  					1.7 -- 1.5 features + string
  			    -- Case labels should be compile time constants
  			    -- Switch statements without break is called as fallthrough switch conditions
 * 				
 * 	2. Iterative
 * 			while
 * 			do..while
 * 			for
 * 			foreach
 * 	3. Transfer
 * 			break
 * 			continue
 * 			return
 * 			try
 * 			catch 
 * 			finally
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
