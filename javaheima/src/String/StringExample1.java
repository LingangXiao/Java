package String;

import java.util.Scanner;

public class StringExample1 {
    public static void main(String[] args) {
        //手机号码屏蔽中间的数字，保护隐私
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your phone number : ");
        String tel = sc.next();

        String before = tel.substring(0,3); // 0 1 2
        String after = tel.substring(7); // 7 8 9

        String s = before + "****" + after;
        System.out.println(s);
    }
}
