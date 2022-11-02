package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sean");
        list.add("Xiao");
        list.add("123");
        list.add("234");
        list.add("345");

        /*for loop 遍历*/
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            System.out.println(ele);
        }
        System.out.println("-------------------");

        /*迭代器*/
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }
        System.out.println("----------------------------");

        /*foreach*/
        for (String ele:list) {
            System.out.println(ele);
        }
        System.out.println("-------------------------");

        /*lambda*/
        list.forEach(s -> System.out.println(s));
    }
}
