package typetransfer;

public class TypeDemo {
    public static void main(String[] args) {
        byte a = 20;
        int b = a; //变量类型在这里自动转换了，类型范围小的变量可以直接赋值给类型范围大的变量

        //    byte > short > int = char > long > float > double
        //  如果不同的类型一起运算，结果为范围最大的变量

        int c = 20; // 如果大范围变量变成小范围变量，需要强制转换
        // byte d = c; 这个会报错，需要在大范围的变量前面用（）+ 转变后的变量
        byte d = (byte)c; // 但是不能超出变量的范围，比如c = 1500 就不能转换，因为byte最高只能127

        // 小数转换成整数，并不会四舍五入，会直接去掉小数点后的数字，保留前面的整数
    }

}
