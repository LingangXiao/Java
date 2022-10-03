package eg.ShoppingCart;

import java.util.Scanner;

public class ShoppingCart {
    //创建一个简单的模拟购物车
    //要求的功能是可以添加商品，修改商品数量，结算价格
    public static void main(String[] args) {
        //用一个数组来表示购物车，假设最多放100个商品
        Goods[] shoppingCart = new Goods[100];
        //搭建操作架构
        System.out.println("please press the options to operate: ");
        System.out.println("1 add items to the cart");
        System.out.println("2 check the cart");
        System.out.println("3 update the number of the items");
        System.out.println("4 checkout the items");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");
        int command = sc.nextInt();
            switch(command) {
                case 1 :
                    addGoods(shoppingCart);
                    break;
                case 2 :
                    checkGoods(shoppingCart);
                    break;
                case 3 :
                    updateGoods(shoppingCart);
                    break;
                case 4 :
                    checkoutGoods(shoppingCart);
                    break;
            }

    }

    private static void checkoutGoods(Goods[] shoppingCart) {
    }

    private static void updateGoods(Goods[] shoppingCart) {
    }

    private static void checkGoods(Goods[] shoppingCart) {
    }

    public static void addGoods(Goods[] shoppingCart) {

    }
}
