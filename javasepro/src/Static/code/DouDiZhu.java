package Static.code;

import java.util.ArrayList;

public class DouDiZhu {
    /*该房间只需要一副牌
    * 定义一个静态的arraylist用来放牌
    * 在启动游戏房间前，就要把54张牌初始化好
    * */
    public static ArrayList<String> cards = new ArrayList<>();

    /*在main方法前，要把54张牌准备好*/
    static {
        //把牌放到集合中去
        String[] num = {"2", "3", "4","5", "6", "7","8", "9", "10", "J", "Q", "K", "A"};
        String[] colors = {"♥", "♠", "♦", "♣"};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                String card = num[i] + colors[j];
                cards.add(card);
            }
        }
        //单独加入大小王
        cards.add("小🃏");
        cards.add("大🃏");
    }

    public static void main(String[] args) {
        System.out.println(cards);
    }
}
