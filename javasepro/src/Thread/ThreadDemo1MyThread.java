package Thread;

//一定要继承thread类
public class ThreadDemo1MyThread extends Thread{
    /*通过重写run方法，定义线程以后要干嘛*/

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程: " + i);
        }
    }
}
