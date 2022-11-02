package CollectionSet;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        /*理解hashset， linkedhashset 和 treeset
        * */
        /*HashSet
        *  无序列不重复，无索引*/
        Set<String> set = new HashSet<>();
        //Set<String> set = new LinkedHashSet<>(); 有序不重复，无索引
        set.add("Sean");
        set.add("1");
        set.add("2");
        set.add("Sean");
        set.add("Sean");
        set.add("3");
        set.add("4");
        set.add("5");
        System.out.println(set);
    }
}
