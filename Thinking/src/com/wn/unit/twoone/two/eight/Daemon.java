package com.wn.unit.twoone.two.eight;

public class Daemon implements Runnable {

	private Thread[] t = new Thread[10];

	@Override
	public void run() {
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(new DeamonSpawn());
			t[i].start();
			System.out.println("DeamonSpawn " + i + " started.");
		}

		for (int i = 0; i < t.length; i++) {
			System.out.println("t[" + i + "].isDaemon()=" + t[i].isDaemon());
		}
		while (true)
			Thread.yield();
	}

}
