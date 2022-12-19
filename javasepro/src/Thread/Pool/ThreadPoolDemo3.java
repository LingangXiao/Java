package Thread.Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo3 {
    public static void main(String[] args) {
        //创建固定线程数量的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        //只有三个固定的线程，所以第四个永远不被执行，因为前三个线程昨晚就休眠了（因为我们让他们休眠了）
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
    }
}