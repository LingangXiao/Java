package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Sean");
        list.add("Xiao");
        list.add("923");
        System.out.println(list);

        //给指定索引添加元素
        list.add(1, "iphone");
        System.out.println(list);

        //泛型
        ArrayList<String> list1 = new ArrayList<>();
        //之后list1只能添加String
        list1.add("Sean");
        list1.add("Xiao");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(43);

    }

}
