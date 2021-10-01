package com.sujata.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ReturnableThreadJob implements Callable<String> {

	private int counter;
	
	public ReturnableThreadJob(int counter) {
		super();
		this.counter = counter;
	}

	@Override
	public String call() throws Exception {
		
		return Thread.currentThread().getName()+" counter : "+counter;
	}

	
	
}
public class MyFourthDemoClass {

	public static void main(String[] args) {
		
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		
		Future<String> futureValue=executorService.submit(new ReturnableThreadJob(999));
		
		try {
			System.out.println(futureValue.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
