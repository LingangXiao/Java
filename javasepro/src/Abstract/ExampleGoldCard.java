package Abstract;

public class ExampleGoldCard extends ExampleCard{
    @Override
    public void pay(double paymoney) {
        System.out.println("您当前消费： " + paymoney);
        System.out.println("您当前余额： " + getMoney());
        double rs = paymoney * 0.85;
        System.out.println("您实际支付： " + rs);
        setMoney(getMoney() - rs);
        System.out.println(getUserName() + "您消费后余额： " + getMoney());
    }
}
