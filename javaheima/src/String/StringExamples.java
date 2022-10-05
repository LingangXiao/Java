package String;

import java.util.Random;
import java.util.Scanner;

public class StringExamples {
    //开发验证码功能
    //随机产生一个5位数的验证码，每位可以是数字，大写字母或小写字母
    public static void main(String[] args) {
        //先把所有可能放进一个字符串里
        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //循环五次，每次随机抽取一个
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(datas.length()); //随机生成5个index
            char ch = datas.charAt(index);
            code += ch;
        }
        System.out.println(code);


        //模拟用户登录功能,最多尝试3次
        //定义正确的用户名和密码
        String correctUserName = "SeanXiao";
        String correctPassword = "123456";

        //定义一个循环，循环三次让用户登录
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("please enter the username : ");
            String inputName = sc.next();
            System.out.println("please enter the password : ");
            String inputPassword = sc.next();

            //判断登录是否成功
            if (correctUserName.equals(inputName)) {
                if (correctPassword.equals(inputPassword)) {
                    System.out.println("congrats");
                    break;
                }
                else {
                    System.out.println("wrong password, 您还有 " + (3 - (i + 1)) + "次机会");
                }
            }
            else {
                System.out.println("wrong username, 您还有 " + (3 - (i + 1)) + "次机会");
            }

        }
    }
}

