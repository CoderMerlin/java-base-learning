/**
 * synchronized�ؼ���
 * ��ĳ���������
 * @author mashibing
 */

package com.cp.juc.c002_sync;

public class T2 {
	
	private int count = 10;
	
	public void m() {
		synchronized(this) { //�κ��߳�Ҫִ������Ĵ��룬�������õ�this����
			count--;
			System.out.println(Thread.currentThread().getName() + " count = " + count);
		}
	}
	
}

