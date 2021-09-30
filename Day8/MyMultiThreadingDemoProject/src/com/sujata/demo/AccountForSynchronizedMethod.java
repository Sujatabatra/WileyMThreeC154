package com.sujata.demo;

public class AccountForSynchronizedMethod implements Runnable {

//	private static int balance = 1000;
	private int balance = 1000;

//	synchronized public static void withdraw() {
	synchronized public void withdraw() {
		if (balance > 800) {
			System.out.println(Thread.currentThread().getName()
					+ " you have sufficient balance to withdraw and your balance is Rs. " + balance);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= 800;
			System.out.println(Thread.currentThread().getName() + " your balance after withdraw is Rs." + balance);
		} else {
			System.out.println(Thread.currentThread().getName()
					+ " you don't have sufficient balance to withdraw and your balance is Rs. " + balance);
		}

	}

	@Override
	public void run() {
		withdraw();
	}

}
