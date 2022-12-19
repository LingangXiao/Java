package Thread.Pool;

import java.util.concurrent.*;

/*学会自定义线程池*/
public class ThreadPoolDemo {
    public static void main(String[] args) {
        /*public ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler)*/
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        //给线程池任务去处理
        Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        //关闭线程池（但一般不会使用）
        //pool.shutdownNow(); //立即关闭，即使任务没有完成
        pool.shutdown(); //会等到所有任务执行完毕后再关闭

    }
}
