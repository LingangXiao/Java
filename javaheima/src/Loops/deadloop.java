package Loops;

import java.util.Scanner;

public class deadloop {
    public static void main(String[] args){
        /*for (int a = 0; ; a++) { // 也可以写成 for ( ; ; )， 因为不需要创建一个新的数，也不需要a++，以为一直会循环
            System.out.println("deadloop");
        }*/
//经典的死循环写法
//        while (true) {
//            System.out.println("classic dead loop");
//        }

        //密码验证的例子
        //密码是520，需要不断地破解密码，直到成功输入密码
        int password = 520;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("plz enter the password");
            int inputpassword = sc.nextInt();

            if (inputpassword == password) {
                System.out.println("successfully log in");
                break; // 立刻结束当前的循环
            }

            else {
                System.out.println("wrong password");
            }
        }


        //嵌套循环-----------------------------------------------------------------------------------
        //大循环套小循环
        //假如你有老婆，然后犯错了，老婆罚你，一共五天，每天说三遍我爱你
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++ ) {
                System.out.println("I love you");
            }
        }

        //被罚洗碗5天，但是洗到第三天就心软了，所以就停止了
        for (int l = 0; l < 5; l++) {
                System.out.println("wash dish");
                if (l == 2) {
                    break;
                }


        }



    }
}
