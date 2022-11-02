package 斗地主;

/*在启动游戏房间的时候，
* 应该提前准备好54张牌
* 完成洗牌，发牌，牌排序，逻辑*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DouDiZhu {
    public static List<Card> cards = new ArrayList<>();

    //定义一个静态代码块
    static {
        //定义点数
        String[] sizes = {"3","4","5","6","7","8","9","10","j","q","k","a","2"};
        String[] colors = {"♠","♥","♣","♦"};
        //遍历点数和花色
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                //封装成一个牌对象
                Card c = new Card(size, color, index);
                cards.add(c);
            }
        }
        Card c1 = new Card("", "lil joker",++index);
        Card c2 = new Card("","big joker",++index);
        Collections.addAll(cards,c1,c2);
        System.out.println("牌：" + cards);
    }

    public static void main(String[] args) {
        //洗牌
        Collections.shuffle(cards);
        System.out.println(cards);

        //发牌(定义三个玩家)
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        //开始发牌（发51张牌给玩家，留三张作为地主拍）
        for (int i = 0; i < cards.size() - 3; i++) {
            Card c = cards.get(i);
            if (i % 3 == 0) {
                player1.add(c);
            } else if (i % 3 == 1) {
                player2.add(c);
            } else {
                player3.add(c);
            }
        }
        //发三张地主牌
        List<Card> DiZhuPai = cards.subList(cards.size() - 3, cards.size());

        //给玩家的牌排序
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);

        //输出玩家的牌
        System.out.println("player1: " + player1);
        System.out.println("player2: " + player2);
        System.out.println("player3: " + player3);
        System.out.println("DiZhuPai: " + DiZhuPai);
    }

    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, (o1, o2) -> {
            //该如何给大小王和JQKA排序呢
            //我们需要知道牌的大小
            //直接去Card里面定义
            return o2.getIndex() - o1.getIndex();
        });
    }

}
