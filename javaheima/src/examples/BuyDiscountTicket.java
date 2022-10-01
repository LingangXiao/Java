package examples;

import java.util.Scanner;

public class BuyDiscountTicket {
    //让用户输入原价
    //按照淡季和旺季，头等舱和经济舱等不同价位收费
    //5-10月为旺季，头等舱9折，经济舱8.5折
    //11-4月为淡季，头等舱7折，经济舱6.5折
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your ticket price : ");
        double price = sc.nextDouble();
        System.out.println("please enter the month of your ticket");
        int month = sc.nextInt();
        System.out.println("please enter your flight type");
        String type = sc.next();

        System.out.println("price after discount : " + discount(price,month,type));
    }

    public static double discount(double price, int month, String type) {
        //判断当前是旺季还是淡季
        //然后用switch来判断头等舱还是经济舱
        if (month >= 5 && month<= 10) {
            switch (type) {
                case ("firstclass"):
                    price = price * 0.9;
                    break;
                case("economy"):
                    price = price * 0.85;
                    break;
                default:
                    System.out.println("wrong type of the ticket");
                    break;
            }
        }
        else if (month == 11 || month == 12 || month <=4 && month >=1){
            switch (type) {
                case ("firstclass"):
                    price = price * 0.7;
                    break;
                case("economy"):
                    price = price * 0.65;
                    break;
                default:
                    System.out.println("wrong type of the ticket");
                    break;
            }
        }
        else {
            System.out.println("wrong month input");
            return -1;
        }
        return price;
    }

}
