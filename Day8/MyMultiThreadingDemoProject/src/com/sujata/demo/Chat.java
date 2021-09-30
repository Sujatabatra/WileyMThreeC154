package com.sujata.demo;

public class Chat {

	private boolean flag=true;
	
	/*
	 * Thread should show Question when flag is true, otherwise Thread will go in suspended state
	 */
	synchronized public void showQuestion(String question) {
		if(flag==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+question);
		flag=false;
		notify();
	}

	/*
	 * Thread should show Answer when flag is false, otherwise Thread will go in suspended state
	 */
	synchronized public void showAnswer(String answer) {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+answer);
		flag=true;
		notify();
	}
}
