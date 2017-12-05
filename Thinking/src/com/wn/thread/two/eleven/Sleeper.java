package com.wn.thread.two.eleven;

/**
 * join方法
 * 
 * @author weineng
 *
 * @Time 2017年12月5日
 */
public class Sleeper extends Thread {

	private int duration;

	public Sleeper(String name, int sleepTime) {
		super(name);
		duration = sleepTime;
		start();
	}

	@Override
	public void run() {
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			System.out.println(getName() +  " was interrupted ." + "  isInterrupted():" + isInterrupted());
			return;
		}
		System.out.println(getName() + " has awakened");
	}

}
