package operater;

public class operater2 {
    public static void main (String[] args){
        int a = 5;
        System.out.println("abc" + a);

        // 拓展案例

        int k = 3;
        int p = 5;
        int rs = k++ + ++k - --p + p-- - k-- + ++p + 2;
        //++k 就是先加再用这个数字， k++就是先用，在加。在做大型运算的时候，要及时更新变量的实时数值
        // k 3  4 5 4
        // p 5 4 3 4
        // rs 3 + 5 - 4 + 4 - 5 + 4 + 2


        // 赋值运算符
        //+= -= *= /= %=
        int b = 10;
        int c = 100;
        b += c;
        b = b + c;
        //上面两种相等的， 剩下的集中运算符逻辑相同
        //建议使用 += 这种运算符，因为自带强制的类型转换
        //不需要每次都自己转换类型，如果b和c类型不一样。


        //关系运算符
        // == != > >= < <=
        // 一般用boolean来判断


        //逻辑运算符
        // 同时计算多个条件的boolean结果
        /* & and
          |  只有一个是true 结果就是true。 也就是or
          ! not
          ^ 两个条件都是false或者true的时候，结果就是false。两个条件不同结果的时候就是true
          */
        double size = 9.8;
        double storage = 16;
        System.out.println(size >= 6.5 & storage >= 15);
        // 买一个手机，需要6.5寸以上， 内存大于15的手机。所以这个满足需求，就是true。

        // && and ||
        // && : if the left side is false, then we do not execute the right side
        // || : if the left side is true, then we do not execute the right side
        //那些只有一个符号的逻辑运算符，不管怎样都会全部运算的


        //三元运算符
        double score = 98;
        String res = score >= 60 ? "pass" : "fail";
        // 标准格式是 ? "" : ""
        // 在一个条件后面加上？， 然后补上两个字符串来描述结果，中间用：隔开。如果是true就会返回左边的字符串，反之返回右边的字符串
        System.out.println(res);

        int q = 10;
        int w = 2000;
        int max = q > w ? q : w;
        // 也不仅仅可以用于字符串，也可以比较两个数字，取决于这个三元表达式最左边定义的类型
        System.out.println(max);

        // example : 寻找三个数中的最大值
        int e, r, t;
        e = 50;
        r = 60;
        t = 70;
        int temp = e > r ? e : r;
        int largest = temp > t ? temp : t;
        System.out.println(largest);
        // 有没有一行就能写出来的代码呢？
        int largest1 = e > r ? e > t ? e : t : r > t ? r : t;
        // int largest1 = （e > r） ? （e > t ? e : t） : （r > t ? r : t）;
        // e先和r比较，较大的数字再去和t比较
        System.out.println(largest1);


    }
}
