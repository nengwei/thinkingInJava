package com.wn.module.factory.singleton;

/**
 * 
 * @author weineng
 *
 * @time   2017-12-11
 * 
 * @desc  单例模式：构造器为private，保证有一个对象存在。通过getInstance获取。
 */
public class Singleton_01 {

	private static final Singleton_01 single = new Singleton_01();

	private Singleton_01() {
	}

	public Singleton_01 getInstance() {
		return single;
	}

}
