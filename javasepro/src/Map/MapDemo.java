package Map;

import java.util.*;

public class MapDemo {
    /*认识Map体系：无序，不重复，无索引*/
    public static void main(String[] args) {
        Map<String,Integer> goods = new HashMap<>(); //究极经典代码
        goods.put("nike", 3);
        goods.put("adidas", 2);
        goods.put("gucci", 5);
        goods.put("nike",4);
        System.out.println(goods);

        Map<String,Integer> goods1 = new LinkedHashMap<>();
        goods1.put("nike", 3);
        goods1.put("adidas", 2);
        goods1.put("gucci", 5);
        goods1.put("nike",4);
        System.out.println(goods1);

        //清空集合
        goods1.clear();
        System.out.println(goods1);

        //判断是否为空
        System.out.println(goods1.isEmpty());

        //根据键获得对应值
        Integer key = goods.get("nike");
        System.out.println(key);

        //删除某个特定元素
        System.out.println(goods.remove("gucci"));
        System.out.println(goods);

        //获取全部的键集合
        Set<String> sets = goods.keySet();
        System.out.println(sets);

        //获取全部的值
        Collection<Integer> values = goods.values();
        System.out.println(values);

        //合并集合
        Map<String,Integer> goods2 = new HashMap<>();
        goods2.put("yeezy", 10);
        goods2.put("AJ", 23);
        goods.putAll(goods2);
        System.out.println(goods);
    }
}
