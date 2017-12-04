package com.wn.thread.two.four;

import java.util.concurrent.Callable;

/**
 * 从任务中产生返回值
 * 
 * @author weineng
 *
 * @Time 2017年11月29日
 */
public class TaskWithResult implements Callable<String> {

	private int id;

	public TaskWithResult(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		return "result of TaskWithResult" + id;
	}

}
