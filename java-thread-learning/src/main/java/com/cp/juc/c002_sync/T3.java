/**
 * synchronized�ؼ���
 * ��ĳ���������
 * @author mashibing
 */

package com.cp.juc.c002_sync;

public class T3 {

	private int count = 10;
	
	public synchronized void m() { //��ͬ���ڷ����Ĵ���ִ��ʱҪsynchronized(this)
		count--;
		System.out.println(Thread.currentThread().getName() + " count = " + count);
	}


}
