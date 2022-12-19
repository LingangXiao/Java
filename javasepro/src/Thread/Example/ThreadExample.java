package Thread.Example;

public class ThreadExample {
    /*取钱例子，线程安全问题
    * 一个银行账户
    * 两个人同时从里面取前*/
    public static void main(String[] args) {
        Account acc = new Account("123456", 100000);

        //创建两个线程对象，表示两个人同时进来了
        Thread t1 = new DrawThread(acc, "Sean");
        t1.start();

        Thread t2 = new DrawThread(acc, "Lingang");
        t2.start();

    }
}
