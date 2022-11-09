package Nov3_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo5 {
    /*收集Stream流的数据到集合或者数组中去*/
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张无极","张三丰","张山","李四");
        Stream<String> st = names.stream().filter(s -> s.startsWith("张"));
        List<String> zhangList = st.collect(Collectors.toList());
        System.out.println(zhangList);
    }
}
