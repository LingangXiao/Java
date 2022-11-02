package Algorithm;

import java.util.Arrays;

public class AlgorithmDemo {
    public static void main(String[] args) {
        /*选择排序
        * 就是拿第一个后后面的比，比自己小就交换，比自己大就不变
        * 直到所有都比完
        * 一共需要 数组长度-1 轮*/
        int[] arr = {5, 1, 3, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        /*二分查找
        * 必须是排好序的
        * 占用内存是比选择排序少的
        * */

        int[] arr1 = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        System.out.println(binarySearch(arr1, 78));

    }
    public static int binarySearch(int[] arr, int a) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex <= rightIndex) {
            //取中间的索引
            int midIndex = (leftIndex + rightIndex) / 2;
            if (a > arr[midIndex]) {
                leftIndex = midIndex + 1;
            } else if (a < arr[midIndex]) {
                rightIndex = midIndex - 1;
            }
            else {
                return midIndex;
            }
        }
        return -1; //证明没找到
    }
}
