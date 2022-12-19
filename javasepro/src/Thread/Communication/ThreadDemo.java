package Thread.Communication;

public class ThreadDemo {
    /*了解线程通信的流程*/
    public static void main(String[] args) {
        //三个人存钱，两个人取钱
        //1 创建账户对象，代表五个人共同操作的账户
        Account acc = new Account("123456", 0);
        //2 创建两个个取钱的线程
        new DrawThread(acc, "小红").start();
        new DrawThread(acc, "小明").start();
        //3 创建三个存钱的线程
        new DepositThread(acc, "亲爹").start();
        new DepositThread(acc, "干爹").start();
        new DepositThread(acc, "岳父").start();
    }
}
