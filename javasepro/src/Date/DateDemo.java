package Date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        //example 计算当前时间往后1个小时121秒后的时间是多少
        long time = System.currentTimeMillis();
        time += (60 * 60 + 121) * 1000;
        Date d2 = new Date(time); //这个可以把时间毫秒值转为对应的日期对象
        System.out.println(d2);
    }



}
