package Abstract;

/*某加油站推出了两种支付卡
* 一种是预存10000，之后享受8折
* 一种是预存5000，之后享受8.5折
* 卡片需要包含主人的名称，余额，支付功能*/

public class Example {
    public static void main(String[] args) {
        ExamplePlatCard p = new ExamplePlatCard();
        p.setUserName("Sean");
        p.setMoney(10000);
        p.pay(3000);

    }
}
