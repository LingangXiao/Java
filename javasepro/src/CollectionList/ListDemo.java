package CollectionList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        /*创造一个arrayList*/
        List<String> list = new ArrayList<>();
        list.add("Sean");
        list.add("Xiao");
        list.add("123");
        list.add("234");
        list.add("345");

        //在某个索引位置插入元素
        list.add(2,"33");
        System.out.println(list);

        //删除元素
        list.remove(3);
        System.out.println(list);

        //取得某个元素
        System.out.println(list.get(2));

        //修改某个索引位置的元素
        System.out.println(list.set(0,"armand"));
        System.out.println(list);
    }


}
