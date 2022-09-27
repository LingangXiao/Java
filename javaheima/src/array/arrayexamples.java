package array;

import java.util.Random;
import java.util.Scanner;

public class arrayexamples {
    public static void main (String[] args) {
        //依次输入5个员工的工号，然后随机展示出来顺序
        //我们需要先把员工的工号存储到一个数组中
        //然后我们需要遍历每一个元素，然后生成一个随机的数组
        //再用随机生成的元素，替换该index上面的元素
        int[] Worker = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Worker.length; i++) {
            System.out.println("plz enter your" + (i+1) + "worker's number");
            int number1 = sc.nextInt();
            Worker[i] = number1;
        }

        //遍历数组中的所有元素后，随机创造一组index出来，然后和原本的index交换
        Random r = new Random();
        for (int k = 0; k < Worker.length; k++) {
            //得到当前数组的index，Worker[k]
            //然后再随机出一个新的顺序，Worker[index]
            //然后再把这两个位置的元素替换
            int index = r.nextInt(Worker.length);

            int TempWorker = Worker[index];  // 先把新的值放在一个temp里
            Worker[index] = Worker[k];      //然后再把老的值放进新的数组里面
            Worker[k] = TempWorker;         //最后再把存在temp里面的新值放进老值

        }

        //遍历新的数组元素，然后输出
        for (int l = 0; l < Worker.length; l++) {
            System.out.print(Worker[l] + "\t");
        }

    }
}
