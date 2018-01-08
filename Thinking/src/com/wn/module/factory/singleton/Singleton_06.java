package com.wn.module.factory.singleton;

public class Singleton_06 {

	private static class SingletonClassInstance {
		private static final Singleton_06 instance = new Singleton_06();
	}

	public static Singleton_06 getInstance() {
		return SingletonClassInstance.instance;
	}

	private Singleton_06() {
		
	}

}
