package CollectionSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    /*不重复，无索引，可排序
    * 对于int和double，默认按照大小排序
    * 字符串按首字符编号排序
    * 自定义类型，需要自己指定排序规则*/
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>();
        sets.add(1);
        sets.add(4);
        sets.add(2);
        sets.add(3);
        System.out.println(sets);

        Set<String> sets1 = new TreeSet<>();
        sets1.add("Sean");
        sets1.add("Armand");
        sets1.add("Xiao");
        sets1.add("sean");
        System.out.println(sets1);
        //字符串是先大写，再小写，再中文，之后是按照首字符的编号排序

        //return o1.getWeight() - o2.getWeight();
        Set<Apple> sets2 = new TreeSet<>(( o1,  o2) -> Double.compare(o1.getPrice(), o2.getPrice()) );
        sets2.add(new Apple("red fuji", "red", 9.9, 10));
        sets2.add(new Apple("blue fuji", "blue", 10.9, 23));
        sets2.add(new Apple("yellow fuji", "yellow", 11.9, 34));

        System.out.println(sets2);
    }
}
