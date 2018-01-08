package com.wn.module.factory.singleton;

/**
 * 
 * @author weineng
 * 
 * @time 2017-12-11
 * 
 * @desc 同步代码优化:每次调用都要同步
 */
public class Singleton_04 {

	private static Singleton_04 intance = null;

	private Singleton_04() {
	}

	public static Singleton_04 getInstance() {
		
		synchronized (Singleton_04.class) {
			if (intance == null) {
				intance = new Singleton_04();
			}
		}

		return intance;
	}

}
