package ATMexample;

public class Account {
    private String cardNumber;
    private String userName;
    private String password;
    private double money;
    private double limitmoney; //每次取钱的额度

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimitmoney() {
        return limitmoney;
    }

    public void setLimitmoney(double limitmoney) {
        this.limitmoney = limitmoney;
    }
}
