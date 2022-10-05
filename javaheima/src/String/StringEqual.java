package String;

import java.util.Scanner;

public class StringEqual {
    public static void main(String[] args) {
        //对比正确的登录名
        String name = "Sean";
        String psw = "123456";

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the user name");
        String userName = sc.next();
        System.out.println("please enter the password");
        String password = sc.next();

        //判断用户输入的与正确的密码和账户是否相同
        /*if (name == userName && psw == password) {
            System.out.println("successfully log in");
        }
        else {
            System.out.println("wrong name or password");
        } */
        // 如果这样写的话，即使密码一样，也会显示失败
        //因为 == 对比的是地址，并不是内容

        //所以我们需要用equals，这个只会对比String里面的内容，不管地址
        // public boolean equals() 只对比字符内容是否一致
        // public boolean equalsIgnoreCase () 只对比内容是否一直，忽略大小写
        if (name.equals(userName) && psw.equals(password)) {
            System.out.println("successfully log in");
        }
        else {
            System.out.println("wrong name or password");
        }

        //忽略大小写的API通常用于验证码这样的业务逻辑
        String sysCode = "AsDfGh";
        String code1 = "asdfgh";
        System.out.println(sysCode.equalsIgnoreCase(code1));

    }
}
