	package com.scp.serialization;

	
	/**
	 * A extends Thread
	 * 
	 *  A a = new A() ; new
	 *  a.start();  //Runnable
	 *  		--Create Thread
	 *  		-- Register this thread with OS Scheduler
	 *  
	 *  whenever OS picks up that thread from Scheduler
	 *  will start executing run method(Task) -- Running
	 *  
	 *  
	 *  A impl runnable
	 *  A a = new A();
	 *  Thread t = new Thread(a);//new
	 * t.start(); //Runnable
	 * 			--Create Thread
	 *  		-- Register this thread with OS Scheduler
	 * 
	 *  whenever OS picks up that thread from Scheduler
	 *  will start executing run method(Task) -- Running
	 *  
	 *Waiting -- In case depends on other resource -- Thread.sleep, Object wait method
	 *Complted -- All run method task has been completed--
	 *
	 *W
	 *
	 */
	public class TestThread {
			public static void main(String[] args) {
				
				MyThread1 t1 = new MyThread1();//e Thead --new
				t1.start(); //Runnable
				
				
			   MyThread2 ob = new MyThread2();//im Runn
				Thread t2 = new Thread(ob);//New
				t2.start(); //Runnable
			}
	}
	
	
	// New  -- Runnable --Running -- Complted
								
								//waiting
	
	class MyThread1 extends Thread{
		
		@Override
		public void run() {
		 //Task -- Thread	
		}
	}
	
	
	class MyThread2 implements Runnable{
	
		@Override
		public void run() {
			
		}
		
	}
