package com.wn.module.factory.singleton;
/**
 * 
 * @author weineng
 *
 * @time   2017-12-11
 * 
 * @desc  01的优化   lazy loaded
 */
public class Singleton_02 {
	
	private static Singleton_02 instance= null;
	
	public Singleton_02() {
	}
	
	private static Singleton_02 getInstance(){
		if(instance == null){
			instance = new Singleton_02();
		}
		return instance;
	}

}
