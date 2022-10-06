package ArrayList;

import java.util.ArrayList;

public class ArrayListApi {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sean");
        list.add("Xiao");
        list.add("shi");
        list.add("baba");

        //获取某个索引位置的元素值
        String e = list.get(2);
        System.out.println(e);

        //获取集合的大小
        System.out.println(list.size());

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //删除某个索引处的元素值，并且返回被删除的
        System.out.println(list);
        String e2 = list.remove(2);
        System.out.println(list);
        System.out.println(e2);

        //直接删除元素，成功返回true，失败返回false
        System.out.println(list.remove("Xiao")); //如果有两个一样的元素，默认先删除前面的一个
        System.out.println(list);

        //修改某个索引位置的元素值
        String e3 = list.set(0, "armand");
        System.out.println(e3); // 返回被修改之前的值
        System.out.println(list);
    }
}
