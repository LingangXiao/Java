package ATMexample;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * ATM系统的入口
 */
public class ATM {
    public static void main(String[] args) {
        //定义账户类
        //定义一个集合容器，负责以后存储全部的账户对象，进行相关的业务操作
        ArrayList<Account> accounts = new ArrayList<>();
        //展示系统的首页
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==========welcome to Sean ATM system============");
            System.out.println("1. login in");
            System.out.println("2. sign up");

            System.out.println("please enter the number : ");
            int command = sc.nextInt();

            switch (command) {
                case 1 :
                    //log in
                    log_in(accounts, sc);
                    break;
                case 2 :
                    //sign up
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("wrong command");
            }
        }
    }

    /**
     * 用于用户登录的操作
     * @param accounts 一个集合所有账号的集合
     * @param sc input
     */
    private static void log_in(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("============系统登录操作============");
        if (accounts.size() == 0) {
            System.out.println("there is no valid account");
            return;
        }
        //正式进入登录操作
        while (true) {
            System.out.println("please enter the log in card number : ");
            String inputCardNumber = sc.next();
            //判断卡号是否存在
            Account acc = getAccountByCardNumber(inputCardNumber, accounts);
            if (acc == null) {
                System.out.println("invalid card number!");
            }
            else {
                //让用户输入密码，并且认证密码
                while (true) {
                    System.out.println("please enter your password : ");
                    String inputPassword = sc.next();
                    if (acc.getPassword().equals(inputPassword)) {
                        System.out.println("congrats, " + acc.getUserName() + " has successfully logged in, your card number is " + acc.getCardNumber());
                        //展示操作页
                        showUserCommand(acc, sc, accounts);
                        return;
                    }
                    else {
                        System.out.println("wrong password!");
                    }
                }
            }
        }
    }

    /**
     * 展示登录后的操作页
     */
    private static void showUserCommand(Account acc, Scanner sc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("============用户操作页============");
            System.out.println("1 查询账户");
            System.out.println("2 存钱");
            System.out.println("3 取钱");
            System.out.println("4 转账");
            System.out.println("5 修改密码");
            System.out.println("6 退出");
            System.out.println("7 注销账户");
            System.out.println("please enter your choice: ");
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1 :
                    showAccount(acc);
                    break;
                case 2 :
                    depositMoney(acc, sc);
                    break;
                case 3 :
                    drawMoney(acc, sc);
                    break;
                case 4 :
                    transferMoney(acc, sc, accounts);
                    break;
                case 5 :
                    updatePassword(acc, sc);
                    return;
                case 6 :
                    System.out.println("退出成功");
                    return; //return 会退出当前的方法，而break会停止循环
                case 7 :
                    if (deleteAccount(acc, sc, accounts)) {
                        return;
                    }
                    else {
                        break;
                    }
                default:
                    System.out.println("wrong command");
            }
        }
    }

    /**
     * 销户功能
     * @param acc
     * @param sc
     * @param accounts
     */
    private static boolean deleteAccount(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("============销户操作============");
        System.out.println("你真的要销户吗？ y/n");
        String rs = sc.next();
        switch (rs) {
            case "y" :
                if (acc.getMoney() > 0) {
                    System.out.println("您账户中还有钱，不能直接销户");
                }
                else{
                    System.out.println("请再次输入密码: ");
                    String psw = sc.next();
                    if (acc.getPassword().equals(psw)) {
                        accounts.remove(acc);
                        System.out.println("您的账户销户成功");
                        return true;
                    }
                    else {
                        System.out.println("密码错误");
                    }
                }
                break;
            default:
                break;
        }
        return false;
    }

    /**
     * 修改密码
     * @param acc 当前登录的账号
     * @param sc 扫描器
     */
    private static void updatePassword(Account acc, Scanner sc) {
        System.out.println("============修改密码操作============");
        while (true) {
            System.out.println("请您输入当前密码： ");
            String oldPassword = sc.next();
            if (oldPassword.equals(acc.getPassword())) {
                while (true) {
                    System.out.println("请输入新的密码: ");
                    String newPassword = sc.next();
                    System.out.println("请您确认新密码: ");
                    String confirmPassword = sc.next();
                    if (newPassword.equals(confirmPassword)) {
                        acc.setPassword(newPassword);
                        System.out.println("密码修改成功");
                        return;
                    }
                    else {
                        System.out.println("两次输入的密码不一致");
                    }
                }
            }
            else {
                System.out.println("wrong password input");
            }
        }
    }

    /**
     * 转账系统
     * @param acc 当前的账户
     * @param sc 录入系统
     * @param accounts 所有的账户的集合
     */
    private static void transferMoney(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("============用户转账操作============");
        if (accounts.size() < 2) {
            System.out.println("当前系统中不足两个账户");
            return; //结束方法
        }
            //开始转账
        if (acc.getMoney() == 0) {
            System.out.println("您的账户里没有钱可以转账");
            return;
        }

        while (true) {
            System.out.println("请输入您要转账的账户卡号： ");
            String acceptCardNumber = sc.next();

            //这个卡号不能是自己的卡号
            if (acceptCardNumber.equals(acc.getCardNumber())) {
                System.out.println("请不要输入自己的卡号");
                continue; //不同于return，这个不会结束循环，而是仅仅结束当此循环，并且开始下一次的循环
            }

            //根据输入的卡号来查询对方账户对象
            Account acceptAcc = getAccountByCardNumber(acceptCardNumber, accounts);
            if (acceptAcc == null) {
                System.out.println("您输入的账户不存在");
            }
            else {
                //账户存在，开始认证形式
                String withFirstNameAcc = acceptAcc.getUserName();
                String noFirstNameAcc = "*" + withFirstNameAcc.substring(1);
                    System.out.println("请您输入被转账者: " + noFirstNameAcc + " 的姓氏");
                    String firstName = sc.next();
                    if (withFirstNameAcc.startsWith(firstName)) {
                        while (true) {
                            System.out.println("请您输入转账金额： ");
                            double transfer = sc.nextDouble();
                            if (transfer > acc.getMoney()) {
                                System.out.println("您没有足够的存款用于转账,您最多可以转账： " + acc.getMoney());
                            }
                            else {
                                acc.setMoney(acc.getMoney() - transfer);
                                acceptAcc.setMoney(acceptAcc.getMoney() + transfer);
                                System.out.println("转账成功，您的账户还剩余： " + acc.getMoney());
                                return;
                            }
                        }
                    }
                    else {
                        System.out.println("wrong first name");
                    }
            }
        }

    }

    /**
     * 取钱
     * @param acc 当前账户对象
     * @param sc 扫描器
     */
    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("============用户取钱操作============");
        //判断是否足够钱
        if (acc.getMoney() < 0.01) {
            System.out.println("当前账户中的余额不足，不能取钱");
            return;
        }

        //提示用户输入取钱金额
        System.out.println("please enter the money you wanna draw");
        double draw = sc.nextDouble();
        if (draw > acc.getLimitmoney()) {
            System.out.println("sorry, you have exceed the daily limit");
        }
        else {
            if (draw <= acc.getMoney()) {
                System.out.println("您已成功取走：" + draw);
                acc.setMoney(acc.getMoney() - draw);
                showAccount(acc);
            }
            else {
                System.out.println("sorry, you do not have enough deposit");
            }
        }
    }

    /**
     * 存钱
     * @param acc 当前账户对象
     * @param sc 扫描器
     */
    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("============用户存钱操作============");
        System.out.println("please enter the money you want to deposit: ");
        double money = sc.nextDouble();
        acc.setMoney(acc.getMoney() + money); //更新余额，现有的钱+新存的钱
        System.out.println("that money had already goes into your account");
        showAccount(acc);
    }

    /**
     * 展现当前的账户
     */
    private static void showAccount(Account acc) {
        System.out.println("============当前的账户信息如下============");
        System.out.println("card number: " + acc.getCardNumber());
        System.out.println("User name: " + acc.getUserName());
        System.out.println("deposit: " + acc.getMoney());
        System.out.println("limit: " + acc.getLimitmoney());
    }

    /**
     * 用于用户的开户操作
     *
     * @param accounts 接受的账户集合
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("============系统开户操作============");
        //1,创建一个账户对象，用于后期封装
        Account account = new Account();
        //2,录入当前的账户信息
        System.out.println("please enter your name : ");
        String inputeName = sc.next();
        account.setUserName(inputeName);

        while (true) {
            System.out.println("please enter your password : ");
            String inputPassword = sc.next();
            System.out.println("please reenter your password : ");
            String reenterInputPassword = sc.next();
            if (reenterInputPassword.equals(inputPassword)) {
                //true = 密码认证通过，可以注入给账户对象
                account.setPassword(inputPassword);
                break;
            }
            else {
                System.out.println("sorry, the second password is different from the first one");
            }
        }

        System.out.println("please enter your daily limit : ");
        double limitMoney = sc.nextDouble();
        account.setLimitmoney(limitMoney);

        //为账户随机创造一个8位的卡号，还要与其他的卡号不一样（不能重复）
        String cardNumber = getRandomCardNumber(accounts);
        account.setCardNumber(cardNumber);

        //3,把账户对象添加到账户集合中去
        accounts.add(account);
        System.out.println("congrats, Mrs/Ms " + inputeName + ", you account is successfully registered! Your card number is : " + cardNumber);
    }

    /**
     * 随机创造出一个8位数的卡号，且不能重复
     * @param accounts 一个集合所有账号的集合
     * @return
     */
    private static String getRandomCardNumber(ArrayList<Account> accounts) {
        //创造卡号
        Random r = new Random();
        while (true) {
            String cardNumber = "";
            for (int i = 0; i < 8; i++) {
                cardNumber += r.nextInt(10);
            }
            //判断是否重复
            Account currentAcc = getAccountByCardNumber(cardNumber, accounts);
            if (currentAcc == null) {
                return cardNumber;
            }
        }
    }

    /**
     * 根据卡号查询出账户对象
     *
     * @param cardNumber 卡号
     * @param accounts 全部的账户集合
     * @return
     */
    private static Account getAccountByCardNumber(String cardNumber, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardNumber().equals(cardNumber)) {
                return acc;
            }
        }
        return null;
    }
}
