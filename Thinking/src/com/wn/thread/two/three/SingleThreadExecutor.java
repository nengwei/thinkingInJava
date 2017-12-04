package com.wn.thread.two.three;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.wn.thread.LiftOff;

/**
 * SingleThreadExecutor:线程数量为1的FixThreadExecutor
 * 
 * @author weineng
 *
 * @Time 2017年11月29日
 */
// 提交多个任务，这些任务将排队，每个任务都会在下一个任务开始之前运行结束，所有的任务将使用相同的线程。会
// 序列化所有提交给他的任务，并会维护他自己的悬挂任务队列
public class SingleThreadExecutor {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();//Executors:执行者  Single Thread Executor:单线程执行程序
		for(int i = 0 ; i < 5 ; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}
}