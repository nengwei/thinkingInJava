package com.wn.thread.two.five;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.wn.thread.LiftOff;

/**
 * sleep test
 * 
 * @author weineng
 *
 * @Time 2017年12月4日
 */
public class SleepingTask extends LiftOff {

	public void run() {
		while (countDown-- > 0) {
			try {
				System.out.println(status());
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				System.err.println("Interrupted");
			}
		}
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			exec.execute(new SleepingTask());
		exec.shutdown();
	}

}
