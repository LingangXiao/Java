package Date;

import java.sql.Date;
import java.time.Instant;
import java.time.ZoneId;

public class InstantDemo {
    public static void main(String[] args) {
        //得到一个Instant时间戳对象
        Instant instant = Instant.now();
        System.out.println(instant); //这个只会得到世界标准时间

        //怎么得到当地时间呢
        Instant instant1 = Instant.now();
        System.out.println(instant1.atZone(ZoneId.systemDefault()));

        //如何去返回Date对象
        Date date = (Date) Date.from(instant);
        System.out.println(date);
    }
}
