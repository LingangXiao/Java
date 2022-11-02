package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);

        //格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        String rs = sdf.format(d); //记得拿个String接收下，不然输出的是地址
        System.out.println(rs);

        System.out.println("--------------------------------------------------");

        //example 请计算出2021年08月06日11点11分11秒，往后2天14小时49分钟06秒之后的时间是多少
        String datestr = "2021年08月06日 11:11:11";

        //把字符串解析成日期对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss"); //格式必须和要解析的一模一样
        Date d1 = sdf1.parse(datestr);
        long time = d1.getTime() + (2L * 24 * 60 * 60 + 14 * 60 * 60 + 49 * 60 + 6) * 1000; //2后面加个L，以防结果超过int的范围
        String rs1 = sdf1.format(time);
        System.out.println(rs1);

        //example 秒杀活动
        /*餐厅做活动，2020年11月11号0：0：0开始，2020年11月11号0：10：0结束
        * 小贾下单付款时间为2020年11月11号0：3：47
        * 小冰下单付款时间为2020年11月11号0：10：34
        * 用代码说明两位同学有没有参加上秒杀活动*/
        String startTime = "2021.10.11 00:00:00";
        String endTime = "2021.10.11 00:10:00";
        String xiaoJia = "2021.10.11 00:03:47";
        String xiaoBing = "2021.10.11 00:10:34";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date d2 = sdf2.parse(startTime);
        Date d3 = sdf2.parse(endTime);
        Date d4 = sdf2.parse(xiaoJia);
        Date d5 = sdf2.parse(xiaoBing);

        if (d4.after(d2) && d4.before(d3)) {
            System.out.println("congrats to xiaoJia");
        }
        else {
            System.out.println("sorry to xiaoJia");
        }

        if (d5.after(d2) && d5.before(d3)) {
            System.out.println("congrats to xiaoBing");
        }
        else {
            System.out.println("sorry to xiaoBing");
        }

    }

}
