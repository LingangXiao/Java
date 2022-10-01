package examples_stage1;

import java.util.Random;
import java.util.Scanner;

public class ShuangSeQiu {
    public static void main(String[] args) {
        //双色球， 需要用6个红球和1个蓝球来组成7个数字的数组
        //红球的范围是1-33，篮球的范围是1-16，红球不能重复
        int[] luckyNumber = createLuckyNumber();
        printArray(luckyNumber);
        int[] userNumber = userInputNumber();
        printArray(userNumber);
        judge(luckyNumber, userNumber);

    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + " ,");
        }
        System.out.println(" ]");
    }

    public static void judge(int[] luckyNumber, int[] userNumber) {
        //用两个变量来判断是否中将
        //一个记录有几个红球重复
        //一个用来判断蓝球有几个重复
        int redsame = 0;
        int bluesame;
        for (int i = 0; i < luckyNumber.length - 1; i++) {
            for (int j = 0; j < userNumber.length - 1; j++) {
                if (userNumber[i] == luckyNumber[j]) {
                redsame++;
                    }
                }
            }
        bluesame = userNumber[userNumber.length - 1] == luckyNumber[luckyNumber.length - 1] ? 1 : 0;

        //中将情况
        if (redsame == 6 && bluesame == 1) {
            System.out.println("congrats, you earn the jackpot");
        }
        else if (redsame >= 3 && redsame <= 5 && bluesame == 1 ) {
            System.out.println("congrats, you earn $10");
        }
        else if(redsame <3 && bluesame == 1) {
            System.out.println("congrats, you earn $5");
        }
        else{
            System.out.println("sorry, you did not hit the number");
        }

    }

    public static int[] userInputNumber() {
        int[] input = new int[7];
        Scanner sc = new Scanner(System.in);
        //先录入红球的数字
        for (int i = 0; i < input.length - 1; i++) {
            System.out.println("please enter your " + (i + 1) + "th number of red");
            int userInputRed = sc.nextInt();
            input[i] = userInputRed;
        }
        //录入蓝球
        System.out.println("please enter your number of blue");
        int useInputBlue = sc.nextInt();
        input[input.length - 1] = useInputBlue;

        return input;
    }

    public static int[] createLuckyNumber() {
        int[] numbers = new int[7];
        Random r = new Random();
        for (int i = 0; i < numbers.length - 1; i++) {
            //需要判断当前号码是否使用过，如果使用过，就要重新生成，直到不重复为止
            while (true) {
                boolean flag = true; //默认red是没有重复的
                int red = r.nextInt(33) + 1;
                for (int j = 0; j < i; j++) {
                    if (red == numbers[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    numbers[i] = red;
                    break;
                }

            }
        }

        //还要为最后一个位置生成蓝球号码
        int blue = r.nextInt(16) + 1;
        numbers[numbers.length - 1] = blue;

        return numbers;
    }
}
