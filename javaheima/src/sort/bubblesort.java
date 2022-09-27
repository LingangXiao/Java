package sort;

public class bubblesort {
    public static void main(String[] args) {
        //bubble sort
        int[] arr = {5, 2, 3, 1};

        // 定义一个循环比较的次数
        for (int i = 0; i < arr.length - 1; i++) {
            //定义一个内部循环的次数和展位
            for (int j = 0; j < arr.length - i - 1; j++) {
                //判断j当前位置的元素值，前一位的数是否比后一位大，如果大，则交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //遍历数组，然后输出
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "\t");
        }
    }
}
