package com.scp.serialization;

import java.util.concurrent.CountDownLatch;

public class Manager {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		CountDownLatch countDown = new CountDownLatch(2);
		JavaDev javaT1 = new JavaDev(countDown);
		JavaBackEnd javaBackendT2 = new JavaBackEnd(countDown);
		
		Thread t1 = new Thread(javaT1,"JavaDev1");
		Thread t2 = new Thread(javaBackendT2,"JavaBackEndDev2");
		t1.start();
		t2.start();

		System.out.println("No of teams yet to complete their tasks-- "+countDown.getCount());
		
		Thread.sleep(5000);
		
		
		countDown.await(); //

		System.out.println("Dev yet to complete -- "+countDown.getCount());
		
		Thread.sleep(3000);
		System.out.println("Starting QA Team Task--");
		
		CountDownLatch qaCountDown = new CountDownLatch(3);
		QATeam qaTeam1= new QATeam(qaCountDown,1000);
		QATeam qaTeam2= new QATeam(qaCountDown,5000);
		QATeam qaTeam3= new QATeam(qaCountDown,7000);
		
		Thread q1 = new Thread(qaTeam1,"QA Tester1");
		Thread q2 = new Thread(qaTeam2,"QA Tester2");
		Thread q3 = new Thread(qaTeam3,"QA Tester3");
		
		q1.start();
		q2.start();
		q3.start();

		qaCountDown.await();
		
		System.out.println("Start deployement....!");
		
		
		
	}

}


class JavaDev  implements Runnable{

	CountDownLatch countLatch = null;
	
	public JavaDev(CountDownLatch countLatch) {
		super();
		this.countLatch = countLatch;
	}

	@Override
	public void run() {
			try {
				
				System.out.println("\n");
				
				for(int i=0;i<10;i++){
					System.out.print(i +",");
				}
				System.out.println("\n");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +"Execution Completed....!");
			countLatch.countDown(); //inform to manager
	}
	
}


 class QATeam implements Runnable{

	 CountDownLatch qaTeamCountDownL = null;
	 long sleepTime = 0;
	 
	 public QATeam(CountDownLatch qaTeamCountDownL,long l) {
		super();
		this.qaTeamCountDownL = qaTeamCountDownL;
		this.sleepTime=l;
	}

	@Override
	public void run() {
		System.out.println("Qa Team is starting the task now....!" +Thread.currentThread().getName());
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		qaTeamCountDownL.countDown();
		System.out.println("Completed" +Thread.currentThread().getName());
	}
	 
 }
 
 class JavaBackEnd  implements Runnable{

		CountDownLatch countLatch = null;
		
		public JavaBackEnd(CountDownLatch countLatch) {
			super();
			this.countLatch = countLatch;
		}

		@Override
		public void run() {
				try {
					System.out.println("\n");
					for(int i=100;i>0;i--){
						System.out.print(i +",");
					}
					
					System.out.println("\n");
					
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() +"Execution Completed....!");
				countLatch.countDown(); //inform to manager
		}
		
	}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 


