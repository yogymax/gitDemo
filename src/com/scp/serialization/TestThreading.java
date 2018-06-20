		package com.scp.serialization;

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
					t1.start();
					t2.start();
					t1.join();
					
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
		
		
		
		class KillThreadDemo extends Thread{ 
			volatile boolean flag=true;
			volatile int count =0;
			public void killThread(){
				flag=false;
				System.out.println("Killing --" + Thread.currentThread().getName());
			}
			public KillThreadDemo(String name) {
				super(name);
			}
			public void run(){
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
			}
		}
		
		
		
		
		
		
		
		