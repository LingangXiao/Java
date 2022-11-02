package regex;

import java.util.Scanner;

public class RegexExample {
    public static void main(String[] args) {
        /*校验手机号码，邮箱*/
        //checkPhone();
        checkEmail();
    }

    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please enter your phone number: ");
            String phoneNum = sc.next();
            if (phoneNum.matches("1[3-9]\\d{9}")) {
                System.out.println("good");
                break;
            }
            else {
                System.out.println("bad");
            }
        }
    }

    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please enter your Email: ");
            String email = sc.next();
            if (email.matches("\\w{1,30}@[a-z0-9]{2,20}(\\.[a-z0-9]{2,20}){1,2}")) {
                System.out.println("good");
                break;
            }
            else {
                System.out.println("bad");
            }
        }
    }
}
