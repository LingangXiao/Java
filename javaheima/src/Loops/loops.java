package Loops;

public class loops {
    public static void main (String[] args){
        // for loop -------------------------------------------------------------------------
        // 输出3次helloworld.
        for (int a = 0; a < 3; a++){
            System.out.println("helloworld");
        }

        //求1-10之间的数据之和
        int result = 0;
        for (int b = 1; b < 11; b++){
            result += b;
        }
        System.out.println(result);

        //求1-10之间的奇数和
        int result1 = 0;
        for (int c = 1; c < 11; c++){
            if (c % 2 != 0){
                result1 += c;
            }
        }
        System.out.println(result1);

        //水仙花数
        //水仙花是一个三位数，个位，十位和百位的数的立方加起来要等于原数
        int count = 0;
        for (int d = 100; d < 1000; d++){
            int ge = d % 10;
            int shi = d / 10 % 10;
            int bai = d / 100;
            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == d){
                System.out.print( d +"\t");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);

        //while loop---------------------------------------------------------------------------------------
        int i = 0;
        while (i < 3){
            System.out.println("hello");
            i++;
        }

        //example 珠穆朗玛峰
        double h = 0.1;
        int j = 0;
        while (h <= 8848860){
            h = h * 2;
            j++;
        }
        System.out.println(j);
        System.out.println(h);

        //do-while loop
        //好处：一定会先执行一次循环体，比如刷票软件。一开始不需要判断有没有票，直接开始抢，再看抢没抢到。
        int k = 0;
        do {
            System.out.println("do-while");
            k++;
        }while (k < 3);


    }

}

