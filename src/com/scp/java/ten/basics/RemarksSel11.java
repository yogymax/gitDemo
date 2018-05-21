package com.scp.java.ten.basics;

public class RemarksSel11 {
	
/**
 * Steps for java installation and configuration on your machine
 * 		1. Download jdk8 from oracle's site 
 * 			(check machine's bit version whether its 32 bit or 64 bit)
 * 		2. install it -- default directory would be prog file however
 * 			you can install it at any locatn
 * 		3. Java root directory = java's installation directory before bin
 *      4. Set Environment variables
 *      		-- Open control panel
 *      		-- Top right cornor search for env 
 *      		-- you will get 2 options
 *      				-- System level
 *      				-- Account level
 *      		-- Click on System level
 *      				-- Click on Environment varible button
 *      				-- System -- New
 *      			(Add New Var)	
 *      					JAVA_HOME= java's root directory
 *      			(Edit existing path var)
 *      					path=------------;%JAVA_HOME%\bin
 *      
 *      5. Open fresh command prompt
 *      6. You can type following commands, should not get is "not a recognized commnad output"
 *      	in case you getting such type of message-- recheck you configuration/env var/ java paths
 *      	>>java -version
 *      	>>javac
 *      
 *      
 *      
 *  Eclipse IDE
 *  
 *  How to create new java project--
 *  		-- File -- New -- Project-- Specify Project Name(XYZ) -- confire jre
 *  			make sure it's pointing jdk instead of jre -- finish
 *  
 *   
 *   XYZ
 *   	--src
 *   	--jre system libraries
 *     
 *     
 *  JDK 
 *  	-- JAVA DEV KIT
 *  	-- platform depenedent
 *  	-- Development componenets
 *  		-- every developement comp's responsibility is equal to JDK's resp
 *  	-- JDK will JRE
 *  	--JDK = JRE + Set of dev comp
 *  	-- Physically exist -- you can install it
 *  
 *  JRE
 *  	-- Java RUntime env
 *  	-- Not to execute a prog instead of provide a runtime env to .class files
 *  	-- Platform Dependent
 *  	-- JRE has set of libraries
 *  				-- set of jars
 *  						-- set of .class files
 *  
 *  	-- Physically Exists-- you can install it but you will nt be having JDK
 *  
 *  JVM -- 
 *  		-- Java virtual machine
 *  		-- Physically Exists - NO
 *  		-- Read bytecode (.Class) /intermediate code line by line
 *  		 and convert that line into machine instrcuctions
 *  	
 *  		bytecode is platform independent
 *  
 *  
 *  JIT -- 
 *  	whenver bytecode lines which might generate same kind of instruction
 *  	those will be processed by JIT in one go.
 *  	-- Boost up the prog execution
 *  	Just in time compiler
 *  
 *  Java is high level programming lang
 *  
 *  
 *  Compiler vs interpeter		
 *     
 * 
 */
	
	
}
