package com.wn.unit.twoone.two.eight;

import java.util.concurrent.TimeUnit;

/**
 * 后台线程：只要有一个非后台线程在运行，程序就不会终止。若所有非后台线程全部终止，则程序也就终止了。
 * 
 * @author weineng
 *
 * @Time 2017年12月5日
 */
public class SimpleDaemons implements Runnable {

	@Override
	public void run() {
		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + "" + this);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread daemons = new Thread(new SimpleDaemons());
		daemons.setDaemon(true);// 设为后台线程
		daemons.start();
		TimeUnit.MILLISECONDS.sleep(175);
	}

}
