package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> goods = new HashMap<>(); //究极经典代码
        goods.put("nike", 3);
        goods.put("adidas", 2);
        goods.put("gucci", 5);
        goods.put("Yeezy",4);
        System.out.println(goods);

        //键找值
        Set<String> keys = goods.keySet();
        for (String key : keys) {
            int value = goods.get(key);
            System.out.println(key + " --> " + value);
        }

        //键值对
        //先通过entrySet把map转为Set集合形式,然后foreach
        for (Map.Entry<String, Integer> stringIntegerEntry : goods.entrySet()) {
            String key = stringIntegerEntry.getKey();
            int value = stringIntegerEntry.getValue();
            System.out.println(key + " ---> " + value);
        }

        //lambda
        goods.forEach((key, value) -> System.out.println(key + " -----> " + value));
    }
}
