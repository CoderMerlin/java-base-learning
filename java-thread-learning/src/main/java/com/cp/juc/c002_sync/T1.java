/**
 * synchronized关键字
 * 对某个对象加锁
 * @author mashibing
 */

package com.cp.juc.c002_sync;

public class T1 {
	
	private int count = 10;
	private Object o = new Object();
	
	public void m() {
		synchronized(o) { //任何线程要执行下面的代码，必须先拿到o的锁
			count--;
			System.out.println(Thread.currentThread().getName() + " count = " + count);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			T1 t = new T1();
			new Thread(t::m,i+"").start();

		}
	}
}

