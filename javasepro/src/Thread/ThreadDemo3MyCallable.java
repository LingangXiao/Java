package Thread;

import java.util.concurrent.Callable;

public class ThreadDemo3MyCallable implements Callable<String> {

    private int n;

    public ThreadDemo3MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return "系现成的执行结果是" + sum;
    }
}
