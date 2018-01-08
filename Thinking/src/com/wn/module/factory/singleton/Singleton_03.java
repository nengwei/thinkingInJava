package com.wn.module.factory.singleton;

/**
 * 
 * @author weineng
 * 
 * @time 2017-12-11
 * 
 * @desc 单例:同步
 */
public class Singleton_03 {

	private static Singleton_03 instance = null;

	private Singleton_03() {
	}

	public synchronized static Singleton_03 getInstance() {
		if (instance == null) {
			instance = new Singleton_03();
		}
		return instance;
	}
}
