package APIs.StringBuilder;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    //用于修正运算失真的情况，比如0.1 + 0.2 = 0.300000000004
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal a2 = BigDecimal.valueOf(b);
        BigDecimal a3 = a1.add(a2);
        System.out.println(a3);

        //有些不能精度运算的就不能用BigDecimal
        BigDecimal a11 = BigDecimal.valueOf(10.0);
        BigDecimal a22 = BigDecimal.valueOf(3.0);
        //BigDecimal a33 = a11.divide(a22);
        //System.out.println(a33); //因为除不开，所以不能用
        //但是我们可以用这种方法
        BigDecimal a44 = a11.divide(a22, 2, RoundingMode.HALF_UP); //保留两位小数，然后四舍五入
        System.out.println(a44);
    }
}
