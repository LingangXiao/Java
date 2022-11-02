package Date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DurationAndPeriod {
    public static void main(String[] args) {
        //计算日期间隔差异 period
        LocalDate today = LocalDate.now();
        LocalDate birthDay = LocalDate.of(2000,1,7);
        Period period = Period.between(birthDay, today);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        //duration
        LocalDateTime today1 = LocalDateTime.now();
        LocalDateTime birthDay1 = LocalDateTime.of(2000, 1, 7, 20, 33, 02, 00);
        Duration duration = Duration.between(birthDay1, today1); //第二个参数减去第一个参数
        System.out.println(duration.toDays());
    }
}
