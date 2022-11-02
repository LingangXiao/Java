package Methode;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        /*collections 常用API*/
        List<String> names = new ArrayList<>();
        /*names.add("123");
        names.add("234");
        names.add("345");
        names.add("456");
        这样很麻烦，可以用collections的方法来批量加*/
        Collections.addAll(names, "123","234", "345","456");
        System.out.println(names);

        /*打乱list的集合顺序*/
        Collections.shuffle(names);
        System.out.println(names);

        /*排序*/
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,6,3,8,5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
