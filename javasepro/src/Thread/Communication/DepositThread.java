package Thread.Communication;

public class DepositThread extends Thread{
    private Account acc;
    public DepositThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        //取钱的方法
        while (true) {
            try {
                acc.depositMoney(100000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
