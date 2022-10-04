package eg.ShoppingCart;

import java.util.Scanner;

public class ShoppingCart {
    //创建一个简单的模拟购物车
    //要求的功能是可以添加商品，修改商品数量，结算价格
    public static void main(String[] args) {
        //用一个数组来表示购物车，假设最多放100个商品
        Goods[] shoppingCart = new Goods[100];
        //搭建操作架构
        while (true) {
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
                    addGoods(shoppingCart, sc);
                    break;
                case 2 :
                    checkGoods(shoppingCart);
                    break;
                case 3 :
                    updateGoods(shoppingCart, sc);
                    break;
                case 4 :
                    checkoutGoods(shoppingCart);
                    break;
                default:
                    System.out.println("没有该功能");
            }
        }

    }

    private static void checkoutGoods(Goods[] shoppingCart) {
        checkGoods(shoppingCart);
        double finalPrice = 0;
        for (int i = 0; i < shoppingCart.length; i++) {
             Goods g = shoppingCart[i];
             if (g != null) {
                 finalPrice += (g.price * g.buyNumber);
             }
             else {
                 System.out.println("your cart is empty now");
                 break;
             }
        }
        System.out.println("the final price will be " + finalPrice);
    }

    private static void updateGoods(Goods[] shoppingCart, Scanner sc) {
        while (true) {
            System.out.println("please enter the item's id you wanna update");
            int id = sc.nextInt();
            Goods g = getGoodById(shoppingCart, id);
            if (g == null) {
                System.out.println("we dont have this item in our cart");
            }
            else {
                System.out.println("please enter the amount for " + g.name + "you wanna update");
                int buyNum = sc.nextInt();
                g.buyNumber = buyNum;
                System.out.println("updated");
                checkGoods(shoppingCart);
                break;
            }
        }
    }

    public static Goods getGoodById (Goods[] shoppingcart, int id) {
        for (int i = 0; i < shoppingcart.length; i++) {
            Goods g = shoppingcart[i];
            if (g != null) {
                if (g.id == id) {
                    return g;
                }
            }
            else {
                return null; // 一直找，直到找到了null的商品
            }
        }
        return null; //代表找完了所有的商品，都没有找到
    }

    private static void checkGoods(Goods[] shoppingCart) {
        //查询购物车中的信息并且展示
        System.out.println("--------------shoppingCart----------------");
        System.out.println("编号\t\t名称\t\tprice\t\t数量");
        for (int i = 0; i < shoppingCart.length; i++) {
            Goods g = shoppingCart[i];
            if (g == null) {
                break;
            }
            else {
                System.out.println(g.id + "\t\t" + g.name + "\t\t" + g.price + "\t\t" + g.buyNumber);
            }
        }
    }

    public static void addGoods(Goods[] shoppingCart, Scanner sc) {
        System.out.println("please enter the serial number : " );
        int id = sc.nextInt();
        System.out.println("please enter the name : ");
        String name = sc.next();
        System.out.println("please enter the total amount of the goods : ");
        int buyNum = sc.nextInt();
        System.out.println("please enter the price : ");
        double price = sc.nextDouble();

        //把上面所有的信息封装成一个商品对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.buyNumber = buyNum;
        g.price = price;

        //把商品对象添加到购物车数组中去
        for (int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i] == null) {
                //说明此位置没有元素，可以把新买的商品存进去
                shoppingCart[i] = g;
                break; //已经成功找到位置了，就可以推出了，不然就会一直加了
            }
        }
        System.out.println("您的商品已经添加到购物车了");
    }
}
