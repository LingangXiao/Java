package Nov4_exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println("__________________________"); //这行打不出来，因为异常已经终止的程序


    }
}
