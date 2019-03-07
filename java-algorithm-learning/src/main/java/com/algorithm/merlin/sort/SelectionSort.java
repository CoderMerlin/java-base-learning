package com.algorithm.merlin.sort;

import java.util.Arrays;

/**
 * @author Merlin
 * @Title: SelectionSort
 * @ProjectName java-base-learning
 * @Description: 选择排序
 * @date 2019/3/4 12:06
 */
public class SelectionSort {

    /**
     * 算法说明：
     * 选择排序(Selection sort)是一种简单直观的排序算法。
     * 它的工作原理是每一次从待排序的数据元素中选出最小(或最大)的一个元素，存放在序列的起始(末尾)位置，直到全部待排序的数据元素排完。
     * 选择排序是不稳定的排序方法
     * （比如序列[5， 5， 3]第一次就将第一个[5]与[3]交换，导致第一个5挪动到第二个5后面）。
     */
    public static int[] selectionSort(int[] arr) {

        //定义一个临时变量
        int temp;
        //定义一个装载下标
        int pos;

        //遍历的趟数
        for (int i = 0; i < arr.length - 1; i++) {
            //每次循环给下标赋值
            pos = 0;
            //每趟比较后拿到最大值的下标
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j] > arr[pos]) {
                    pos = j;
                }
            }
            //进行交换
            temp = arr[pos];
            arr[pos] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,2,5,3};
        int[] selectionSort = selectionSort(arr);
        System.out.println("Coder编程：   ");
        Arrays.stream(selectionSort).forEach(e -> System.out.print("  "+e));
    }
}
