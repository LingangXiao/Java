package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTraversal {
    public static void main(String[] args) {
        /*首先可以用iterator来遍历collection*/
        Collection<String> list = new ArrayList<>();
        list.add("Sean");
        list.add("Sean");
        list.add("xiao");
        list.add("123");
        System.out.println(list);

        Iterator<String> it = list.iterator();
        /*String ele = it.next();
        System.out.println(ele);
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/
        //太麻烦，要用循环做
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }

        /*foreach的加强for loop
        * iterator不能遍历数组，
        * 但是foreach可以遍历数组*/
        Collection<String> list1 = new ArrayList<>();
        list1.add("Sean");
        list1.add("Sean");
        list1.add("xiao");
        list1.add("123");
        System.out.println(list1);

        //                  👇  这里是要便利的数组或者集合
        for (String ele : list1) {
            System.out.println(ele);
        }
        System.out.println("---------------------");
        //也可以用foreach来遍历数组
        int[] age = {12, 23, 34, 35};
        for (int i : age) {
            System.out.println(i);
        }


        /*lambda表达式遍历集合
        * 最简单*/
        Collection<String> list2 = new ArrayList<>();
        list2.add("Sean");
        list2.add("Sean");
        list2.add("xiao");
        list2.add("123");
        System.out.println(list2);

        list2.forEach(s -> System.out.println(s));

    }
}
