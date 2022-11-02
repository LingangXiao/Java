package Date;

/*calender 是抽象类，不能创建对象的
* 需要用getInstance（）方法来得到对象*/

import java.util.Calendar;
import java.util.Date;

public class CalenderDemo {
    public static void main(String[] args) {
        //拿到系统此刻的日历对象
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1);

        //获取日历信息：public int get （int field）
        int year = c1.get(Calendar.YEAR);
        System.out.println(year);
        int month = c1.get(Calendar.MONTH) + 1; //记得加1，因为月份是从0开始的
        System.out.println(month);

        //修改日历的某个信息
        /*
        c1.set(Calendar.HOUR, 12);
        System.out.println(c1);
        但最好别乱修改*/

        //请问64天后是什么时间
        c1.add(Calendar.DAY_OF_YEAR, 64);

        //拿到此刻日期的对象
        Date d = c1.getTime();
        System.out.println(d);

        
    }
}
