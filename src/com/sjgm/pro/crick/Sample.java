package com.sjgm.pro.crick;

import java.util.Random;

public class Sample implements Runnable {

	@Override
	public void run() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(new Random().nextInt(63636));
	}

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = new Sample();
		Runnable r2 = new Sample();
		Thread thread1 = new Thread(r1);
		Thread thread2 = new Thread(r2);
		thread1.start();
		thread2.start();

		thread1.join(); // wait for thread 1 to terminate
		thread2.join(); // wait for thread 2 to terminate
	}
}
