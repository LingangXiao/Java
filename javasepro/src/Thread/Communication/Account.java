package Thread.Communication;

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

    public synchronized void drawMoney(double money) throws Exception {
        String name = Thread.currentThread().getName();
        if (this.money >= money) {
            this.money -= money;
            System.out.println(name + "取走： " + money);
            this.notifyAll(); //一定要先唤醒别人，再让自己等待
            this.wait(); //让当前对象进入等待
        }
        else {
            this.notifyAll(); //一定要先唤醒别人，再让自己等待
            this.wait(); //让当前对象进入等待
        }
    }

    public synchronized void depositMoney(double money) throws InterruptedException {
        String name = Thread.currentThread().getName();
        if (this.money == 0) {
            this.money += money;
            System.out.println(name + "存了： " + money + " 余额是： " + this.money);
            this.notifyAll(); //一定要先唤醒别人，再让自己等待
            this.wait(); //让当前对象进入等待
        } else {
            this.notifyAll(); //一定要先唤醒别人，再让自己等待
            this.wait(); //让当前对象进入等待
        }
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

}
