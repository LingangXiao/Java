package 包装类;

public class Test {
    public static void main(String[] args) {
        /*自动装箱和自动拆箱
        * 意思就是可以互相转换*/
        int a = 10;
        Integer a1 = 11;
        Integer a2 = a; //可以直接转换

        //包装类可以把基本类型转化成字符串
        Integer a3 = 100;
        String rs = a3.toString();
        System.out.println(rs + 1);

        //可以把字符串类型转换成真实的数据类型
        String a4 = "33";
        int age = Integer.parseInt(a4);
        //或者用valueof
        int age1 = Integer.valueOf(a4);
        System.out.println(age + 1);
        System.out.println(age1 + 1);
    }
}
