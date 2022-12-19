package Thread.Pool;


import java.util.Timer;
import java.util.TimerTask;

/*了解Timer的使用*/
public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer(); //定时器本身就是一个单线程

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行一次");
            }
        }, 3000, 2000);
    }
}

//但是Timer是有缺陷的，他只能单线程，不能多线程，当有一个线程在用Timer，其他的都得等
//而且有一个线程崩了，会导致其他的线程也结束
