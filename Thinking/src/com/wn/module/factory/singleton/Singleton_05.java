package com.wn.module.factory.singleton;

/**
 * 
 * @author weineng
 * 
 * @time 2017-12-11
 * 
 * @desc double-checked locking
 */
public class Singleton_05 {

	private static Singleton_05 instance = null;

	private Singleton_05() {
	}

	public static Singleton_05 getInstance() {
		if (instance == null) {
			synchronized (Singleton_05.class) {
				if (instance == null) {
					instance = new Singleton_05();
				}
			}
		}
		return instance;
	}

}
