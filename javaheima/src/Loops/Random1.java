package Loops;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
    public static void main (String [] args) {
        //学会使用随机数
        Random r = new Random();

        int data = r.nextInt(10); //0-9之间的随机数，如果需要1-10，直接在这个方法后面+1，int data = r.nextInt(10) + 1;
        System.out.println(data);

        //比如是3-17
        //我们先把3-17 减掉3，变成0-14
        int data1 = r.nextInt(15) + 3; //0-14 , 然后加3，就变成了3-17
        System.out.println(data1);


        //猜数字游戏
        //随机生成一个1-100的数字让用户猜，猜大了提示过大，猜小了提示过小
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("plz enter a number (1 - 100)");
            int UserInput = sc.nextInt();

            if (UserInput == number) {
                System.out.println("congrats");
                break;
            }

            else if (UserInput < number) {
                System.out.println("the number you input is smaller than the random number");
            }

            else if (UserInput > number) {
                System.out.println("the number you input is bigger than the random number");
            }
        }

    }
}
