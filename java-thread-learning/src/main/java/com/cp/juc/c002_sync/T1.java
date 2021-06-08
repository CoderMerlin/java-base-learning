/**
 * synchronized�ؼ���
 * ��ĳ���������
 * @author mashibing
 */

package com.cp.juc.c002_sync;

public class T1 {
	
	private int count = 10;
	private Object o = new Object();
	
	public void m() {
		synchronized(o) { //�κ��߳�Ҫִ������Ĵ��룬�������õ�o����
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

