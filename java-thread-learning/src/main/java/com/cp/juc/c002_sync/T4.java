/**
 * synchronized�ؼ���
 * ��ĳ���������
 * @author mashibing
 */

package com.cp.juc.c002_sync;

public class T4 {

	private static int count = 10;
	
	public synchronized static void m() { //�����ͬ��synchronized(FineCoarseLock.class)
		count--;
		System.out.println(Thread.currentThread().getName() + " count = " + count);
	}
	
	public static void mm() {
		synchronized(T4.class) { //����һ������дsynchronized(this)�Ƿ���ԣ�
			count --;
		}
	}

}
