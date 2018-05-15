package com.scp.java.ten.basics;

import java.util.concurrent.TimeUnit;


public class TestThreading {
	
	public static void main(String[] args) throws InterruptedException {
		/*MyThreadUsingExtend t1 = new MyThreadUsingExtend();
		MyThreadUsingExtend t2 = new MyThreadUsingExtend();
		t1.start();
		t2.start();*/

		
		/**
		 * Thread()
		 * Thread(runnable wala object)
		 *Thread(runnable obj, threadName) 
		 * 
		 * join is aggressive -- ek bar execution start hua to complete
		 * kar k hi bahar aunga or else kisine interrupt kiya to
		 * 
		 * 
		 * sleep vs wait
		 * join vs yield
		 * thread class contructors
		 * thread class methods
		 * thread vs process
		 * extends thread vs implements runnable
		 * list thread class methods
		 * why char[] is better for storing user passwords instread of string
		 * why string is immutable in java
		 * string vs stringbuffer vs stringbuilder
		 * thread lifecycle
		 * 		new  -- created thread object
		 * 		runnable -- start method
		 * 		running -- gets the cpu to thread /run method execution
		 * 		waiting -- sleep wait
		 * 		exit -- execution completed
		 * 
		 * can we give the execution sequence gurrenty 
		 * #p1 --purpose of start method
		 * 		-- it creates a new thread
		 * 		-- register that thread with thread scheduler
		 * 		-- invoke run method of thread
		 * 
		 * run 
		 * 		-- we override run method
		 * 			business logic for you thread
		 * 
		 * can we overriide if overriden what will happen
		 * 		run -- Yes -- you need to override -- to provide business for a thread
		 * 		start -- Yes -- new thread will not be created will be treated as normal method execution happen inside main thread only
		 * 		
		 * calling of a method
		 * 		run -- new thread will not be created will be treated as normal method execution happen inside main thread only
		 * 		start -- ref #p1 
		 * 
		 * list down all exception that you have faced in threading
		 * 
		 * why threading -- benefits
		 * multitasking vs multiprogramming vs multithreading vs multiprocessing
		 * 		
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		MyThreadUsingRunnable r1= new MyThreadUsingRunnable();
		Thread tr1 =  new Thread(r1,"Thread1");
		Thread tr2 =  new Thread(r1,"Thread2");
		Thread tr3 =  new Thread(r1,"Thread3");
		tr2.start();
		tr2.start();
		
		
		

/**	
 * Sleep Vs wait
 * 		-- sleep static method of a thread class however wait is object's instace method
 * 		-- sleep will go into waiting state it will not release the resources
 * 			wait  -- will release the resources and go into waiting state
 * 		-- sleep will come outside waiting state to runnable state only after
 * 			time interval expires or interruted 
 * 			wait -- notity or notifyall on that object or time interval expires
 * 		
 * 
 * join vs yeild
 * 
 * 
 */
	
	}


	
	
}

class MyThreadUsingRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
		
			if(i==5){
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			
			System.out.println(Thread.currentThread().getName() +" : " +i);
		}
	}
	
}


class MyThreadUsingExtend extends Thread {
	
	//Business logic for a thread
	public void run(){
		for(int i=1;i<=10;i++){
			
			System.out.println("i Value -- " + i);
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}



/**
 * Default Imports 
 * 		-- Java lang
 * 		-- class of same package
 * 
 * Thread is lightweight process which is a part of process itself
 * one process can have many thread ans threads of a process can communicate
 * with each other and there will common storage within process
 * however every thread will have its private storage area
 * 
 * 
 * 
 * 
 * 
 */
