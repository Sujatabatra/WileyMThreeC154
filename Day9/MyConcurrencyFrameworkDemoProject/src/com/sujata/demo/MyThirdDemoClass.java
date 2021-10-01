package com.sujata.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadOneMoreJob implements Runnable{

	private int counter;
	
	public MyThreadOneMoreJob(int counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" counter : "+counter);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" is Back!! "+counter);
		
	}
	
}
public class MyThirdDemoClass {

	public static void main(String[] args) {
		
		/*
		 * Factory Design Pattern
		 */
		ExecutorService threadPool=Executors.newFixedThreadPool(4);
		
		
		for(int jobId=1;jobId<=10;jobId++) {
			threadPool.execute(new MyThreadJob(jobId));
		}
		threadPool.execute(new MyThreadOneMoreJob(111));
		threadPool.execute(new MyThreadOneMoreJob(222));
		threadPool.execute(new MyThreadOneMoreJob(333));
		
		System.out.println("At line 46");
		
		threadPool.shutdown(); //what all jobs we already have assigned to the pool finish with those jobs but don't accept new jobs
		
		threadPool.execute(new MyThreadOneMoreJob(999));
		
	}

}
