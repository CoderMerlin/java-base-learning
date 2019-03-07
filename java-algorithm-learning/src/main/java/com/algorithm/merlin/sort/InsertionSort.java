package com.algorithm.merlin.sort;

import java.util.Arrays;

/**
 * @author Merlin
 * @Title: InsertionSort
 * @ProjectName java-base-learning
 * @Description: 插入排序
 * @date 2019/3/411:05
 */
public class InsertionSort {

    /**
	 * 算法说明：
	 * 插入排序的基本操作就是将一个数据插入到已经排好序的有序数据中，
	 * 从而得到一个新的、个数加一的有序数据，算法适用于少量数据的排序，
	 * 时间复杂度为O(n^2)。是稳定的排序方法。
	 */

    public static int[] insertionSort(int[] arr) {

        //定义一个临时变量
        int temp;

        //需要循环的趟数，把第一个数当成已经排好的数据，所以从第二位开始 i=1
        for (int i = 1; i < arr.length; i++) {
            //赋值，当前数据的值
            temp = arr[i];

            //每趟都是从后一位去跟前面排好序的数据进行比较,因为前面都是排好序的数据，
            //所以只要从后面比较起，找到了合适就可以替换掉
            while(arr[i-1] > temp) {
                //符合条件，进行替换
                arr[i] = arr[i-1];
                //不断往前，直到退出循环
                i--;
            }
            //退出循环，说明符合,将当前数据
            arr[i] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1,25,3,4,5,7,4,3,2};
        int[] insertionSort = insertionSort(arr);
        System.out.println("Coder编程：   ");
        Arrays.stream(insertionSort).forEach(e -> System.out.print("  "+e));
    }
}
