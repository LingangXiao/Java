package array;

import java.util.Random;
import java.util.Scanner;

public class array1 {
    public static void main (String[] args){
        //如果有大量变量的定义，比如一个班级里面的所有学生名字
        //如果有100个人，String name1 一直到 String name100 十分的麻烦
        //可以直接String[] name = {}； 然后把所有人的名字放进去

        //静态初始化数组
        double[] scores = new double[] {100, 99, 98, 97};
        double[] scores1 = {100, 99, 98, 97};
        //这两个是一样的意思

        //如果在不确定array里面的内容时，可以用动态数组，就是先不写里面的，先定义长度
        //比如一个班有50个人，我刚来这个班，要从头开始输入这个班同学的名字，可以先定义长度
        int[] names = new int [50];

        //数组的遍历，就是一个一个的数据的访问
        //比如找一个班里面，那个同学的成绩最高，我们需要访问完所有学生的成绩才知道
        int[] grade = {12, 23, 34, 45, 56, 78};

        for (int i = 0; i < grade.length; i++){
            System.out.println(grade[i]);
        }

        //数组遍历例子：求和
        //五个销售分别卖了12 13 14 15 16，求销售总额
        int[] sales = {12, 13, 14, 15, 16};
        int sum = 0;

        for (int j = 0; j < sales.length; j++){
            sum += sales[j];
        }
        System.out.println(sum);//sum.sout 可以直接弹出来这个

        //数组求最大值
        int[] price = {15, 99, 90, 98, 70};
        int maxprice = price[0]; //最好用数组第一个数来设置默认值，因为如果是0，可能一个数组都是负数
        for (int i = 0; i < price.length; i++ ) {
            if (price[i] > maxprice) {
                maxprice = price[i];
            }
        }
        System.out.println(maxprice);
        System.out.println("--------------------------");

        //猜数字游戏
        //随机生成5个数字，在1-20之间，让大家来猜数字
        //如果未猜中，提示没猜中
        //如果猜中了，提示猜中了，并且输出该数字第一次出现的位置，直到输出完全部5个数字
        int[] RandomNumber = new int[5];  //5个1-20之间的随机数，并且存入数组
        Random r = new Random();

        for (int j = 0; j < RandomNumber.length; j++){
            RandomNumber[j] = r.nextInt(20) + 1;
        }

        Scanner sc = new Scanner (System.in);
        OUT: //当运行到break OUT的代码时，结束整个while循环,否则只会结束当前的for循环
        while (true) {
            System.out.println("plz enter a number between 1 to 20");
            int UserInput = sc.nextInt();


            for (int k = 0; k < RandomNumber.length; k++) {
                    if (RandomNumber[k] == UserInput) {
                    System.out.println("congrats, the index of the number: " + k );
                    break OUT;
                }
            }
            System.out.println("sorry, your input is not the number");
        }
        for (int k = 0; k < RandomNumber.length; k++) {
            System.out.print(RandomNumber[k] + "\t");
        }
    }
}
