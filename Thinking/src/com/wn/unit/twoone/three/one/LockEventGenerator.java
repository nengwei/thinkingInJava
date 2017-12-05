package com.wn.unit.twoone.three.one;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * lock必须被显示的创建、锁定和释放。代码更灵活。
 * 
 * @author weineng
 *
 * @Time 2017年12月5日
 */
public class LockEventGenerator extends IntGenerator {

	private int currentEvenValue = 0;

	private Lock lock = new ReentrantLock();

	@Override
	public int next() {
		lock.lock();
		try {
			++currentEvenValue;
			Thread.yield();
			++currentEvenValue;
			return currentEvenValue;
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		EvenChecker.test(new LockEventGenerator());
	}

}
