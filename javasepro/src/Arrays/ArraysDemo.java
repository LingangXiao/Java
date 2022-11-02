package Arrays;

import java.util.Arrays;

public class ArraysDemo {
    /*学会使用arrays类常用api*/
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        //二分搜索技术,（前提数组必须提前排好序）就是每次砍掉一半，直接对比目标和每次中间值的大小
        int index = Arrays.binarySearch(arr, 5 );
        System.out.println(index);
    }
}
