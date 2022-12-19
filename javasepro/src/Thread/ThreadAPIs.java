package Thread;

public class ThreadAPIs {
    public static void main(String[] args) throws Exception {
        //当出现了多个子线程的时候，我们不能区分哪个子线程是哪个，我们这是可以setName
        Thread t1 = new ThreadAPIsSub();
        //t1.setName("No.1");
        t1.start();

        Thread t2 = new ThreadAPIsSub();
        t2.start();

        //哪个线程执行他，他就得到哪个线程对象
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        for (int i = 0; i < 6; i++) {
            System.out.println("main线程： " + i);
            if (i == 3) {
                Thread.sleep(3000); //可以让main thread在等于3的时候，停止3秒
            }
        }
        //当出现了多个子线程的时候，我们不能区分哪个子线程是哪个，我们这是可以setName
    }
}
