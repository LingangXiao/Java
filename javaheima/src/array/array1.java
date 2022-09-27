package array;

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
        System.out.println(sum);

    }
}
