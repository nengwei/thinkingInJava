package com.wn.unit.twoone.three.one;

/**
 * 共享资源一般是以对象形式存在的内存片段，但也可以是文件、输入/输出端口，或者是打印机。
 * 要控制对共享资源的访问，得先把他包装进一个对象。然后把所有要访问这个资源的方法标记为synchronized
 * 对某个特定对象来讲，其所有synchronized方法共享同一个锁
 * 将域设为private是重要的，否则，synchronized关键字就不能防止其他任务直接访问域，这样就会产生冲突
 * 每个访问临界共享资源的方法都必须被同步，否则他们就不会正确的工作
 * 
 * @author weineng
 *
 * @Time 2017年12月5日
 */
public class SynchronizedEvenGenerator extends IntGenerator {

	private int currentEvenValue = 0;// 将类的数据成员都声明为private的，而且只能通过方法来访问这些数据。所以可以把方法标记为synchronized来防止资源冲突

	@Override
	public synchronized int next() {
		++currentEvenValue;
		Thread.yield();
		++currentEvenValue;
		return currentEvenValue;
	}

	public static void main(String[] args) {
		EvenChecker.test(new SynchronizedEvenGenerator());
	}

}
