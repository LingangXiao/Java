package examples_stage1;

import java.util.Random;
import java.util.Scanner;

public class YanZhengMa {
    //随机产生的验证码
    //每位可以是数字，大写字母或者小写字母
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter how many items you want to have for your code");
        int s = sc.nextInt();
        System.out.println(createCode(s));
    }

    public static String createCode (int n){
        //定义一个for循环，循环n次，随机生成验证码
        //定义一个字符串的变量来接受随机生成的验证码
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case (0):
                    //可以用ASCII码来写大小写的英文
                    char ch = (char) (r.nextInt(26)+ 65);
                    code += ch;
                    break;
                case (1):
                    char ch1 = (char) (r.nextInt(26)+ 97);
                    code += ch1;
                    break;
                case (2):
                    int number = r.nextInt(10);
                    code += number;
                    break;
            }
        }
        return code;
    }

}
