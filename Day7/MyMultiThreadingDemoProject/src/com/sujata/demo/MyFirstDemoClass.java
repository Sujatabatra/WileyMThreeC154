package com.sujata.demo;

class MyFirstThreadClass extends Thread{
	
	public MyFirstThreadClass() {
		super();
	}
	
	public MyFirstThreadClass(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class MyFirstDemoClass {

	public static void main(String[] args) {
		//New Born
		MyFirstThreadClass thread1=new MyFirstThreadClass();  //thread0
		MyFirstThreadClass thread2=new MyFirstThreadClass("Second");  //Second
		MyFirstThreadClass thread3=new MyFirstThreadClass();  //thread1
		MyFirstThreadClass thread4=new MyFirstThreadClass();  //thread2
		
//		thread2.setName("Second");
		
		thread1.start();
		//ready or running state depending upon scheduling
		thread2.start();
		thread3.start();
		thread4.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());

	}

}
