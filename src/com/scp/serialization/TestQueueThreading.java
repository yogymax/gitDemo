		package com.scp.serialization;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
		
		public class TestQueueThreading {
				public static void main(String[] args) {
					BlockingQueue<Integer> bqueue = new ArrayBlockingQueue<>(5);
					Produce p1 = new Produce(bqueue,"Producer");
					Consume c1 = new Consume(bqueue,"Consumer");
					p1.start();
					c1.start();
				}
		}
			
		
		class Produce extends Thread{
			BlockingQueue<Integer> bqueue = null;

			public Produce(BlockingQueue<Integer> bqueue,String tname) {
				super(tname);
				this.bqueue = bqueue;
			}

			public void run(){
					while(true){
						int randomNo = ThreadLocalRandom.current().nextInt(1,100000);
						try {
							System.out.println("Producing -- " +randomNo);
							bqueue.put(randomNo);
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}
			}
			
		}
		
		class Consume extends Thread{
			BlockingQueue<Integer> bqueue = null;
			public Consume(BlockingQueue<Integer> bqueue,String tname) {
				super(tname);
				this.bqueue = bqueue;
			}
			
			public void run(){
				while(true){
					try {
						System.out.println("Queued items --- "+bqueue);
						Thread.sleep(3000);
						Integer randomNo = bqueue.take();
						System.out.println("Consuming -- " +randomNo);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
		}
			
			
		}
		
