package recursion;

public class RecursionDemo3 {
    public static void main(String[] args) {
        //啤酒问题
        /*啤酒2元1瓶，四个瓶盖换一瓶，两个空瓶换一瓶，请问十块钱可以喝多少瓶酒，剩余多少瓶子和盖子*/
        buyBeer(10);
        System.out.println(totalNum);
        System.out.println(leftBottle);
        System.out.println(leftCap);
    }

    public static int totalNum;
    public static int leftBottle;
    public static int leftCap;


    public static void buyBeer(int money) {
        int beerNum = money / 2 ;
        totalNum += beerNum;

        int capNumber = leftCap + beerNum;
        int bottleNumber = leftBottle + beerNum;

        int allMoney = 0;
        if(capNumber >= 4) {
            allMoney += (capNumber / 4) * 2;
        }
        leftCap = capNumber % 4;


        if(bottleNumber >= 2) {
            allMoney += (bottleNumber / 2) * 2;
        }
        leftBottle = bottleNumber % 2;

        if (allMoney >= 2) {
            buyBeer(allMoney);
        }

    }
}
