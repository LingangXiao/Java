package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*callable和FutureTask方法*/
public class ThreadDemo3 {
    public static void main(String[] args) {
        Callable<String> callable = new ThreadDemo3MyCallable(100);
        //我们还需要把callable交给futuretask对象
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread t = new Thread(futureTask);
        t.start();

        Callable<String> callable1 = new ThreadDemo3MyCallable(100);
        //我们还需要把callable交给futuretask对象
        FutureTask<String> futureTask1 = new FutureTask<>(callable1);
        Thread t1 = new Thread(futureTask1);
        t1.start();

        try {
            String rs = futureTask.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
