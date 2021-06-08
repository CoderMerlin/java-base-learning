/**
 * 对比上面一个小程序，分析一下这个程序的输出
 * @author mashibing
 */

package com.cp.juc.c002_sync;

public class T6 implements Runnable {

	private int count = 10;
	
	public synchronized void run() { 
		count--;
		System.out.println(Thread.currentThread().getName() + " count = " + count);
	}
	
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			T6 t = new T6();
			new Thread(t, "THREAD" + i).start();
		}
	}
	
}
