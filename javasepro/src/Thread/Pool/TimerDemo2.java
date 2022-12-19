package Thread.Pool;

import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/*这是十分推荐的一种定时方式*/
public class TimerDemo2 {
    public static void main(String[] args) {
        ScheduledExecutorService pool = new ScheduledThreadPoolExecutor(3);

        //开启定时任务并且和Timer比较
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "AAA");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, 0, 2, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "BBB");
            }
        }, 0, 2, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "CCC");
            }
        }, 0, 2, TimeUnit.SECONDS);
    }
}
