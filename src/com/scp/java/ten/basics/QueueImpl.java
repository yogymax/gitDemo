package com.scp.java.ten.basics;

import java.util.concurrent.ArrayBlockingQueue;


/**
 * 
 * Queue 
 * 		-- BlockingQueue
 * 				Prioirty
 * 				Delayed
 * 				Synechronous
 * 				Linked
 * 				ArrayBlokcig
 * 
 * Properties
 * All method meanings along when to use
 * Producer consumer problem
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 */



public class QueueImpl {

	public static void main(String[] args) throws InterruptedException {
		
		int numProducers = 10;
        int numConsumers = 1;
         
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(10);
        
        for (int i = 0; i < numProducers; i++){
            new Thread(new Producer(arrayBlockingQueue),"Producer").start();
        }
             
        for (int i = 0; i < numConsumers; i++){
            new Thread(new Consumer(arrayBlockingQueue),"Consumer").start();
        }
 
        // Let the simulation run for, say, 10 seconds
        Thread.sleep(10 * 1000);
 
        // End of simulation - shut down gracefully
        System.exit(0);
 
		
		
		
		
		/**
		 * Iterable
		 * Collection
		 * Queue
		 * BLockingQueue -- Inteface
		 * 		-- ArrayBlockingQueue 
		 * 				--bounded
		 * 		-- PriorityBlockingQueue
		 * 				-- bouned /unbounded
		 * 				-- based on comparable/comparator
		 * 		-- DelayQueue
		 * 				-- Unbounded
		 * 				-- objects should implement delayed inteface and 
		 * 					provide implementatios to getDelay method
		 * 					whichever elements time gets expired will be consumed first
		 * 		-- Synchronousqueue
		 * 				-- At a time maximum one element would be there
		 * 				-- which is equivalent to arrayblockigqueue of one size
		 * 				-- Bounded
		 * 		-- LinkedBlockingQueue
		 * 				--Unbounded queue
		 * 
		 * 					Insertion				Remove
		 *Throws Exceptions 	add(e)				remove() 			
		 *Special Value			offer(e)			poll()    (true/false)	
		 *Blocks				put(e)				take()
		 *Overloaded --			offer(e,time,unit)	poll(time,unit)  (true/false)
		 * 
		 * 
		 * 
		 * 10 20 30 40 50 60
		 * 
		 */

		/**
		 * 0  
		 * -  LHS small
		 * +  LHS large
		 * 
		 */
		
		
	}
	
	
}


class Producer implements Runnable{
    ArrayBlockingQueue<Integer> arrayBlockingQueue = null;
    
	public Producer(ArrayBlockingQueue<Integer> arrayBlockingQueue) {
		super();
		this.arrayBlockingQueue = arrayBlockingQueue;
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName() +" > " +i);
			try {
				arrayBlockingQueue.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		
}


class Consumer implements Runnable{
	ArrayBlockingQueue<Integer> arrayBlockingQueue =null;
	
	public Consumer(ArrayBlockingQueue<Integer> arrayBlockingQueue) {
		super();
		this.arrayBlockingQueue = arrayBlockingQueue;
	}

	@Override
	public void run() {
		Integer consumeedValue;
		try {
			
			consumeedValue = arrayBlockingQueue.take();
			System.out.println(Thread.currentThread().getName() +" : " +consumeedValue);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}






