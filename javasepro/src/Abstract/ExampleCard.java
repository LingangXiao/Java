package Abstract;

public abstract class ExampleCard {
    private String userName;
    private double money;

    public abstract void pay(double paymoney);

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}
