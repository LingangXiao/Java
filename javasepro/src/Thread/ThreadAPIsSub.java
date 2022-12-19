package Thread;

public class ThreadAPIsSub extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            //或者直接在重写的方法里把名字的API直接加进去
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

