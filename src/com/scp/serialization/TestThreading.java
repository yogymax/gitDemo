		package com.scp.serialization;

		/**
		 * 
		 * yeild method -- 
		 * 			t1 n t2 
		 * 			t1 chya context me t2.yield() kel
		 * 			t2 pause kara -- and scheduler same or higher priority aslelaya thread 
		 * 			cpu assign kara -- konta cpu -- jyvar t2 execute hot hota
		 * 			This is not gurrentted one --
		 * 
		 *  t1' context
		 *  t2.join
		 *   
		 * join -- 
		 *        t2 will complete first and den t1 will join
		 *        This is gurreneted once t2 gets the cpu			
		 * yeild --  
		 * 		t2 will pause the execution and will give chance to same or higher priority thread 
		 * 		from thread scheduler (Runnable state)
		 * 		not gurrented it's os system decision
		 * 		
		 * 
		 * 
		 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
	
		/**
		 * can we override start method -- yes -- no new thread will be created
		 * can we overriden run -- yes we have too
		 * can we directly call run method instead of start -- no new thread will be created
		 * and run method will be executed as normal instance method
		 * 
		 * sleep vs wait
		 * why notifiy notifyall and wait methods are inside object class instead of thread class
		 *  
		 * join vs yield
		 * 
		 */

		public class TestThreading {
				public static void main(String[] args) throws InterruptedException {
					ArrayList<Integer> nums = new ArrayList<>();
					KillThreadDemo t1 = new KillThreadDemo("t1");
					KillThreadDemo t2= new KillThreadDemo("t2");
					Thread t = new Thread(t1);
					t.setDaemon(true);
					
					
					//wait --   t3.notify
					//sleep =  s2
					
					/****
					 * t1  --l1
					 * t3  --l2
					 * t4 --l2
					 * t5 --l3
					 * t6--l4
					 * 
					 * t1 t2 =5 
					 * t2--cpu
					 * t1 -- 10
					 * 
					 *  t1 t2 =10 | 5
					 * 
					 * s1
					 * s2
					 * wait() wait(ms) wait(ms,ns) interrupt() -- runnable
					 * waiting -- t1,t3,t5,s2
					 * 
					 * 
					 */
					
					
					
					
					
					//Waiting state --
						//t1 t2  // notify notifyall or timeoutintervale or interrupt --  -- runnable state
						//s1  -- timeout or timeinterval expire -- awake -- runnable state
					
				/*	t1.start();
					t2.start(); //3
					t1.yield();
					t1.join();
				*/	/**
					 * Consider  I have t1 and t2 two threads exeuctuting parrellally
					 * if in t1's context i have written t2.join()
					 * then it's gurrented when t2 gets cpu it will completed it's execution 
					 * before t1
					 */
					
					
					
				//	t1.join();
					
					for(int i=0;i<100;i++){
						System.out.println("i" +i);
					}
					
					
					KillThreadDemo k1 = new KillThreadDemo("k");
					
					
					//ThreadGroup tg = new ThreadGroup("Parent");
					//java.util.concurrent -- 1.5
					
					//demaon thread
					/**					
					 * 
					 * Demean thread is a thread which works at background
					 * 			for examples -- gc
					 * 
					 */
						
					
					
					
					
					
					System.out.println("Completed Thread name  -- "+Thread.currentThread().getName());
/*					Producer p1 = new Producer(nums,1,"p1");
					Producer p2 = new Producer(nums,1,"p2");
					Consumer c1 = new Consumer(nums,1,"c1");
					p2.start();
					c1.start();
					p1.start();
*/					
				}
		}
		
		class Producer extends Thread{
			List<Integer> numbers = null;
			int max_size=0;

			public Producer(List<Integer> ulist, int maxsize,String threadName) {
				super(threadName);
				this.numbers = ulist;
				this.max_size=maxsize;
			}
		
			public void run(){
					while(true){
								synchronized (numbers) {
									System.out.println("Producing elements -- " +Thread.currentThread().getName());
									if(max_size==numbers.size()){
											System.out.println("List is full now...!");
											try {
												numbers.wait();
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
									}else{
										try {
											TimeUnit.SECONDS.sleep(1);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}

											int randomNo = ThreadLocalRandom.current().nextInt(1,10000);
											numbers.add(randomNo);
											System.out.println("Produced Element --" +randomNo);
											numbers.notify();
									}
								}
					}
			}
		}
		
		
		class Consumer extends Thread{
			List<Integer> numbers = null;
			int max_size=0;

			public Consumer(List<Integer> ulist, int maxsize,String threadName) {
				super(threadName);
				this.numbers = ulist;
				this.max_size=maxsize;
			}
		
			public void run(){
					while(true){
								synchronized (numbers) {
									System.out.println("Currently we have these many elements to be consumed " + numbers);
									System.out.println("Consuming elements -- " +Thread.currentThread().getName());
									if(numbers.isEmpty()){
											try {
												numbers.wait();
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
									}else{
										try {
											TimeUnit.SECONDS.sleep(2);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										int num = numbers.remove(0);
										System.out.println("Consumed Element --" +num);
										numbers.notify();
									}
									
									
								}
					}
			}
		}
		
		
		
		class KillThreadDemo implements Runnable{ 
			volatile boolean flag=true;
			volatile int count =0;
			public void killThread(){
				flag=false;
				System.out.println("Killing --" + Thread.currentThread().getName());
			}
			public KillThreadDemo(String name) {
				//super(name);
			}
			public void run(){
				System.out.println(Thread.currentThread().getName() +" -- Running --");
				
				/*
					while(flag ){
						System.out.println("Count value -- "+count);
						try {
							TimeUnit.SECONDS.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						if(Thread.currentThread().getName().equals("t1")){
							if(count>=100){
								killThread();
							}
						}
						
						
						
						
						System.out.println(Thread.currentThread().getName() +" -- Running --"+ThreadLocalRandom.current().nextInt());
					}
					System.out.println("Terminating the thread" +Thread.currentThread().getName());
			*/}
		}
		
		
		
		
		
		
		
		