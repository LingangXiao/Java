package examples_stage1;

public class CopyArray {
    //把一个数组里面的元素复制到另一个数组里
    public static void main(String[] args) {
        int[] arr = {1, 7, 8, 4, 5, 6};
        int[] arr1 = new int[arr.length];

        copy(arr, arr1);

        printArray(arr);
        printArray(arr1);

    }

    public static void copy (int[] arr, int[] arr1) {
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
    }

    public static void printArray (int[] arr) {
        System.out.print("[ ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }

        System.out.println(" ]");
    }

}
