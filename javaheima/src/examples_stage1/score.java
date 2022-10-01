package examples_stage1;

import java.util.Scanner;

public class score {
    //6名评委给选手打分，分数在0-100之间
    //最后去掉一个最高分，一个最低分，然后求剩下4个分数的平均值
    public static void main(String[] args) {
        int[] score = new int[6];
        //录入评委的分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.println("please enter the number" + (i + 1) + " score");
            int allScore = sc.nextInt(); // 需要把分数存到数组相应的位置去
            score[i] = allScore;
        }

        //遍历数组中的每一个分数，并且找到最高分和最低分
        int max = score[0];
        int min = score[0];
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
            sum += score[i];
        }

        //统计平均分
        int average;
        average = (sum - max - min) / (score.length - 2);

        System.out.println("the average score is : " + average);
    }

}
