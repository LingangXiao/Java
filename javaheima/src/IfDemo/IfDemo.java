package IfDemo;

public class IfDemo {
    public static void main(String[] args){
        //心跳60-100是正常，否则需要检查身体
        int HeartRate = 50;
        if (HeartRate < 60 || HeartRate > 100){
            System.out.println("您的心跳是：" + HeartRate + " ,您可能有点病");
        }
        System.out.println("检查结束");


        //发一个1314红包
        double money = 6000;
        if (money >= 1314){
            System.out.println("发送成功");
        }
        else{
            System.out.println("您余额不足");
        }



    }

}
