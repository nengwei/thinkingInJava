package com.wn.thread.two.three;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.wn.thread.LiftOff;

public class FixedThreadPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(5);//有限的线程集，可以限制线程的数量。不用为每个任务都固定的付出创建线程的开销
		for (int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}

}
