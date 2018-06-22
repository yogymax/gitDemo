	package com.scp.serialization;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
/**	
 * BlockingQueue -- interface
 * 		 ArrayBQ -- Bddounded / 
 * 		 LinkedBQ //Bouned + unbounded
 * 	     DelayBQ  // Unbounded -- Impltn delayed -- getDelay -- 0/-1 == consume kara
 * 		 PriorityBQ -- Bounded + Unbounded - -comparable 
 * 		 SyncBQ -- with capacity 1 -- bounded equalivnt to ArrayBQ with size 1
 * 		 transferBQ -  
 * 
 * 
 *
 */



	public class TestConcurrent {
		public static void main(String[] args) throws InterruptedException {
			BlockingQueue<Emp> blockingQueue = new DelayQueue<Emp>();
			//BlockingQueue<Integer> bk = new Prio
			ProduceItems t1 = new ProduceItems(blockingQueue,"Producer");
			ConsumeItems t2 = new ConsumeItems(blockingQueue,"Consumer");
			t1.start();
			t2.start();
			System.out.println(Thread.currentThread().getName() +" -- Completed");
			
			
			
		}
		/*
		 * Bounded -- limit is there
		 * Unbounded  -- unlimited
		 */
		
				
				/**
				 * ArrayBQ
				 * LinkedBQ
				 * 
				 * 
				 */
	}
	
	 class ProduceItems extends Thread{
		 BlockingQueue<Emp> producerQueue= null;
		 
		 public ProduceItems(BlockingQueue<Emp> producerQueue,String tname) {
			super(tname);
			this.producerQueue = producerQueue;
		}
		public void run(){
			// Task -- Worker -- thread -- ProducerItems
			//while(true){
				//int randomNo = ThreadLocalRandom.current().nextInt(1,150);
				Emp e1 = new Emp("A",5000);
				try {
					producerQueue.put(e1);
					System.out.println("Produced -- " + e1  +" -- " + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			//}
			
			
			
		}
	 }
	 
	 class ConsumeItems extends Thread{
		 BlockingQueue<Emp> consumerQueue= null;
		 public ConsumeItems(BlockingQueue<Emp> consumerQueue,String tname) {
			 super(tname);
			this.consumerQueue = consumerQueue;
		}


		public void run(){
			 	//Task -- Worker -- thread -- ConsumerItems
				//while(true){
						try {
							System.out.println(consumerQueue);
							Emp e = consumerQueue.take();
							TimeUnit.SECONDS.sleep(3);
							System.out.println("Consumed -- " +e +" -- " + Thread.currentThread().getName());
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
				//}
			
		 }
	 }
	
	
	
	/**
	 * Synchronize
	 * wait
	 * notify/notifyall
	 * Thread.Sleep/join/yeild
	 * how to get threadname/priority/id
	 * how to set threadname/priority/group
	 * isalive/run/start/
	 */

	 
	 class Emp implements Delayed{ 
		 private String data;
	    private long startTime;

	    public Emp(String userdata, long delay) {
	        this.data = userdata;
	        this.startTime = System.currentTimeMillis() + delay;
	    }

	    @Override
	    public long getDelay(TimeUnit unit) {
	        long diff = startTime - System.currentTimeMillis();
	        return unit.convert(diff, TimeUnit.MILLISECONDS);
	    }

	    @Override
	    public int compareTo(Delayed o) {
	        if (this.startTime < ((Emp) o).startTime) {
	            return -1;
	        }
	        if (this.startTime > ((Emp) o).startTime) {
	            return 1;
	        }
	        return 0;
	    }

	    @Override
	    public String toString() {
	        return "{" +
	                "data='" + data + '\'' +
	                ", startTime=" + startTime +
	                '}';
	    }}
	 