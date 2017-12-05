package com.wn.unit.twoone.three.one;

/**
 * 不正确的访问资源
 * 
 * @author weineng
 *
 * @Time 2017年12月5日
 */
public abstract class IntGenerator {

	private volatile boolean canceled = false;// 该参数是原子性的    

	public abstract int next();

	public void cancel() {
		canceled = true;
	}

	public boolean isCanceled() {
		return canceled;
	}

}
