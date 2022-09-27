package memory;

public class memory1 {
    public static void main(String[] args) {
        //理解内存的运行
        int a = 12;
        System.out.println(a);

        int[] arr = {11, 22, 33};
        System.out.println(arr);
        arr[0] = 12;
        arr[1] = 13;
        arr[2] = 14;
        System.out.println(arr[0]);

        //两个数组变量 指向同一个对象
        int[] arr1 = {12, 23};
        int[] arr2 = arr1;  // 这并不会把数组里的数复制过去，只会复制地址，所以就变成了arr1和arr2指向同一个对象

        arr2[1] = 99; // 因为指向的是同一对象，arr1[1] 也会变成99



    }
}
