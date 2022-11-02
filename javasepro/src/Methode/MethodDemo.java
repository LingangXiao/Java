package Methode;

import java.util.Arrays;

public class MethodDemo {
    /*学习可变参数
    * 可变参数方法内部本质上就是一个数组
    * 一个形参列表中只能有一个
    * 必须放在最后面,放在前面就会全拿走，不会留给其他的参数*/
        public static void main(String[] args) {
            //1,可以不传参数
            sum();
            //2，可以传多个参数
            sum(12,23,34,45);
            //3，甚至一个数组
            sum(new int[]{12,23,34,45,546});
        }


    public static void sum (int...nums) {
        //可变参数在方法内部就是一个数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
