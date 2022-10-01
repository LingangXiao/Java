package examples_stage1;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class encrypt {
    //需要给某系统的数字密码加密
    //在得到密码后，把每一位密码中的数字加5，然后对10求余，最后再反转过来
    public static void main(String[] args) {
        System.out.println("please enter your password size : ");
        Scanner sc = new Scanner (System.in);
        int length = sc.nextInt();
        int[] password = new int[length];

        for (int i = 0; i < password.length; i++) {
            System.out.println("please enter the " + (i + 1) + "number of your password");
            int n = sc.nextInt();
            password[i] = n;
        }

        //打印数组内容，检查一下
        printArray(password);

        //对数组中的数据进行加减乘除加密
        for (int i = 0; i < password.length; i++) {
            password[i] = (password[i] + 5) % 10;
        }

        //把用加减乘除加密的密码反转 //8, 9, 0, 1
        int temp;
        for (int i = 0, j = password.length - 1; i < j; i++, j--) {
                temp = password[i];
                password[i] = password[j];
                password[j] = temp;
        }

        printArray(password);

    }

    public static void printArray(int[] arr){
        System.out.print("[ ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }

        System.out.println(" ]");
    }
}
