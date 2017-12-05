package com.wn.unit.twoone.two.three;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.wn.unit.twoone.LiftOff;

/**
 * 
 * @author weineng
 *
 * @Time 2017年11月27日
 * 
 *       ExecutorService知道如何构建恰当的上下文来执行Runnable对象
 *       CachedThreadPool：在程序执行过程中通常会创建与所需数量相同的线程，然后在他回收旧线程时停止创建新线程，只有当这种方式会引发问题时，才需要切换到FixedThreadPool
 */
public class CachedThreadPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();//防止新任务被提交给这个Executor，当前线程将继续运行在shutDown被调用之前提交的所有任务。
	}

}
