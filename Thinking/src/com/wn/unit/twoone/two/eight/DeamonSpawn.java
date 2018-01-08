package com.wn.unit.twoone.two.eight;

public class DeamonSpawn implements Runnable{

	@Override
	public void run() {
		while(true){
			Thread.yield();
		}
	}

}
