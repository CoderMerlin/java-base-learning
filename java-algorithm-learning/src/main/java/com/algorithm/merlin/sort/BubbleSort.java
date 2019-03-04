package com.algorithm.merlin.sort;

/**
 * @author merlin
 * @Title: BubbleSort
 * @ProjectName java-base-learning
 * @Description: 快速理解冒泡排序
 * @date 2019/2/2820:17
 */
public class BubbleSort {
    /**
     * 算法说明：
     * 冒泡排序（Bubble Sort）
     * 是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。
     * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
     * 这个算法的名字由来是因为越大的元素会经由交换慢慢“浮”到数列的顶端，故名。
     */

    public static int[] bubbleSortOne(int[] arrays){
        //使用临时变量，让两个数互换
        int temp;
        //第一位和第二位比
        if (arrays[0] > arrays[1]) {
            //交换
            temp = arrays[0];
            arrays[0] = arrays[1];
            arrays[1] = temp;
        }

        //第二位和第三位比
        if (arrays[1] > arrays[2]) {
            temp = arrays[1];
            arrays[1] = arrays[2];
            arrays[2] = temp;
        }

        //第三位和第四位比
        if (arrays[2] > arrays[3]) {
            temp = arrays[2];
            arrays[2] = arrays[3];
            arrays[3] = temp;
        }

        //第四位和第五位比
        if (arrays[3] > arrays[4]) {
            temp = arrays[3];
            arrays[3] = arrays[4];
            arrays[4] = temp;
        }
        return arrays;
    }

    public static int[] bubbleSortTwo(int[] arrays){
        int temp;
        //第一位和第二位比
        if (arrays[0] > arrays[1]) {
            //交换
            temp = arrays[0];
            arrays[0] = arrays[1];
            arrays[1] = temp;
        }

        //第二位和第三位比
        if (arrays[1] > arrays[2]) {
            temp = arrays[1];
            arrays[1] = arrays[2];
            arrays[2] = temp;
        }

        //第三位和第四位比
        if (arrays[2] > arrays[3]) {
            temp = arrays[2];
            arrays[2] = arrays[3];
            arrays[3] = temp;
        }
        return arrays;
    }

    public static int[] bubbleSortThree(int[] arrays) {
        //装载临时变量
        int temp;

        //记录是否发生了置换， 0 表示没有发生置换、 1 表示发生了置换
        int isChange;

        //外层循环是排序的趟数
        for (int i = 0; i < arrays.length - 1; i++) {

            //每比较一趟就重新初始化为0
            isChange = 0;

            //内层循环是当前趟数需要比较的次数
            for (int j = 0; j < arrays.length - i - 1; j++) {

                //前一位与后一位与前一位比较，如果前一位比后一位要大，那么交换
                if (arrays[j] > arrays[j + 1]) {
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;

                    //如果进到这里面了，说明发生置换了
                    isChange = 1;

                }
            }
            //如果比较完一趟没有发生置换，那么说明已经排好序了，不需要再执行下去了
            if (isChange == 0) {
                break;
            }
        }
        return arrays;
    }


    public static void main(String[] args) {
        int[] arrays = {2,5,3,7,1};
        //bubbleSortTwo(bubbleSortOne(arrays));
        bubbleSortThree(arrays);
    }

}
