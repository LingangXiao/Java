package scanner;

import java.util.Scanner;

public class scannerlearning {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);//得到一个键盘扫描器对象

        System.out.println("plz enter your age: ");
        int age = sc.nextInt(); //这个代码会等待用户输入数据，直到用户输入完成并且按了回车
        System.out.println("your age is : " + age);


        System.out.println("plz enter your name: ");
        String name = sc.next();
        System.out.println("your name is : " + name);


    }
}
