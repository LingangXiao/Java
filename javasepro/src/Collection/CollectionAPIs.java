package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionAPIs {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        //添加元素，添加成功返回true
        list.add("Sean");
        list.add("Sean");
        list.add("xiao");
        list.add("123");
        System.out.println(list.add("123"));
        System.out.println(list);

        //清空集合的元素
        /*list.clear();
        System.out.println(list);*/

        //判断集合是否为空
        System.out.println(list.isEmpty());

        //获取集合的大小
        System.out.println(list.size());

        //判断集合中是否包含某个元素
        System.out.println(list.contains("Sean"));

        //删除某个元素,如果有重复元素，默认删除最前面的一个
        list.remove("Sean");
        System.out.println(list);

        //把集合转换成数组
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------");
        //合并两个集合
        Collection<String> a1 = new ArrayList<>();
        a1.add("Sean");
        a1.add("Xiao");
        Collection<String> a2 = new ArrayList<>();
        a2.add("Armand");
        a2.add("Xiao");
        a1.addAll(a2);
        System.out.println(a1);
    }
}
