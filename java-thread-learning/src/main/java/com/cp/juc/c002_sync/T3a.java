/**
 * synchronized关键字
 * 对某个对象加锁
 * @author mashibing
 */

package com.cp.juc.c002_sync;

public class T3a {

	private int count = 10;

	public synchronized void m() { //等同于在方法的代码执行时要synchronized(this)
		count--;
		System.out.println(Thread.currentThread().getName() + " count = " + count);
	}

	public void n() { //访问这个方法的时候不需要上锁
		count++;
	}
}
