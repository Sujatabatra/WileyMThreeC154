package com.sujata.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class MyThreadJob implements Runnable{

	private int counter;
	
	public MyThreadJob(int counter) {
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
public class MySecondDemoClass {

	public static void main(String[] args) {
		
		/*
		 * Factory Design Pattern
		 */
		Executor threadPool=Executors.newFixedThreadPool(4);
		
		for(int jobId=1;jobId<=10;jobId++) {
			threadPool.execute(new MyThreadJob(jobId));
		}
		
	}

}
