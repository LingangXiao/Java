package recursion;

public class RecursionDemo {
    public static void main(String[] args) {
        //test();
        System.out.println(f(5));
        System.out.println(f1(5));
        System.out.println(m(1));
    }

    /*public static void test() {
        System.out.println("=====");
        test();
    }*/

    //一个经典的递归例子
    public static int f(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return f(n-1) * n;
        }
    }

    //例子：计算1-n的和
    public static int f1(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return f(n-1) + n;
        }
    }

    //猴子吃桃
    /*第一天摘了若干个桃子，吃了一半+1个
     第二天又吃了剩下的一半+1个
     第三天又吃了剩下的一半+1个
     到第十天的时候发现只有一个桃子了
     请问猴子第一天摘了多少个桃子
     */

    public static int m(int n) {
        if (n == 10) {
            return 1;
        }
        else {
            return 2 * m(n + 1) + 2;
        }
    }

}

