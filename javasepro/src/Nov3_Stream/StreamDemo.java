package Nov3_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        /*一个名字的集合
        * 找出姓为张，且名字长度为三的*/
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张无极","张三丰","张山","李四");

        List<String> zhangName = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("张")) {
                zhangName.add(name);
            }
        }

        List<String> zhangThreeName = new ArrayList<>();
        for (String name : names) {
            if (name.length() == 3) {
                zhangThreeName.add(name);
            }
        }

        System.out.println(zhangThreeName);

        //但是我们可以用一行Stream就把上面说有的代码完成
        names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
}
