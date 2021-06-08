/**
 * synchronized关键字
 * 对某个对象加锁
 * @author mashibing
 */

package com.cp.juc.c002_sync;

public class T4 {

	private static int count = 10;
	
	public synchronized static void m() { //这里等同于synchronized(FineCoarseLock.class)
		count--;
		System.out.println(Thread.currentThread().getName() + " count = " + count);
	}
	
	public static void mm() {
		synchronized(T4.class) { //考虑一下这里写synchronized(this)是否可以？
			count --;
		}
	}

}
