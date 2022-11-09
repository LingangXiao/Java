package Nov8异常;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*让用户输入一个合法的价格为止，要求价格大于0*/
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("plz enter a valid price");
                String price = sc.nextLine();
                double price1 = Double.valueOf(price);

                //判断是否大于0
                if (price1 > 0) {
                    System.out.println("ok");
                }
                else {
                    System.out.println("not ok");
                }
            } catch (NumberFormatException e) {
                System.out.println("plz enter the valid price");
            }
        }

    }
}
