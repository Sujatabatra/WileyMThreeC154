package com.sujata.demo;

public class Account implements Runnable {

	private int balance = 1000;

	public void withdraw() {
//		synchronized (Account.class) {
		synchronized (this) {
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
	}

	@Override
	public void run() {
		withdraw();
	}

}
