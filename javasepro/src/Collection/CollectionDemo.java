package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
* list系列集合：添加的元素是有序，可重复的，有索引
* set系列集合：添加的元素是无序，不重复，无索引*/
public class CollectionDemo {
    public static void main(String[] args) {
        //有序，可重复的，有索引
        Collection list = new ArrayList();
        list.add("Sean");
        list.add("Sean");
        list.add("123");
        list.add(234);
        list.add(true);
        System.out.println(list);

        //无序，不重复，无索引
        //print出来的顺序是打乱的，并且会自动删除同样的元素
        Collection list1 = new HashSet();
        list1.add("Sean");
        list1.add("Sean");
        list1.add("123");
        list1.add(234);
        list1.add(true);
        System.out.println(list1);

        Collection<String> list2 = new ArrayList<>();
        list2.add("java");
        // list2.add(23); 会报错，因为已经固定了只能是String类型

    }
}
