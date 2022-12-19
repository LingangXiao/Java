package Thread.Example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String CardId;
    private double money;

    //最好加final，因为锁一般是唯一不可替换的
    private final Lock lock = new ReentrantLock();

    public Account() {
    }

    public Account(String cardId, double money) {
        CardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return CardId;
    }

    public void setCardId(String cardId) {
        CardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    /*public void drawMoney(double money) {
        //判断是谁在取钱
        String name = Thread.currentThread().getName();
        //再判断是否有足够的钱
        //但我们需要上个锁，防止出现错误
        //只能等一个人完成了，另一个人才能继续取钱
        synchronized (this) { // 可以随意设置锁的名字
            if (this.money >= money) {
                System.out.println(name + "取钱成功。吐出： " + money);
                this.money = this.money - money;
                System.out.println(name + "取钱后还剩余： " + this.money);
            }
            else {
                System.out.println(name + "来取钱，余额不足");
            }
        }
    }*/
    //又或者直接在方法上加synchronized
    /*public synchronized void drawMoney(double money) {
        //判断是谁在取钱
        String name = Thread.currentThread().getName();
        //再判断是否有足够的钱
        //但我们需要上个锁，防止出现错误
        //只能等一个人完成了，另一个人才能继续取钱
            if (this.money >= money) {
                System.out.println(name + "取钱成功。吐出： " + money);
                this.money = this.money - money;
                System.out.println(name + "取钱后还剩余： " + this.money);
            }
            else {
                System.out.println(name + "来取钱，余额不足");
            }
        }*/
        //但是锁代码块比锁方法要性能高

    //还有lock方法
    public void drawMoney(double money) {
        //判断是谁在取钱
        String name = Thread.currentThread().getName();
        //再判断是否有足够的钱
        //但我们需要上个锁，防止出现错误
        //只能等一个人完成了，另一个人才能继续取钱
        lock.lock();
        try {
            if (this.money >= money) {
                System.out.println(name + "取钱成功。吐出： " + money);
                this.money = this.money - money;
                System.out.println(name + "取钱后还剩余： " + this.money);
            }
            else {
                System.out.println(name + "来取钱，余额不足");
            }
        } finally {
            lock.unlock();
        }
    }
}
