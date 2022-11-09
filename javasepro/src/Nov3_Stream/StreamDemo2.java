package Nov3_Stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    /*Stream流的三类方法*/
    public static void main(String[] args) {
        /*--------------------collection----------------------*/
        Collection<String> collection = new ArrayList<>();
        Stream<String> stream = collection.stream();

        /*---------------Map-------------------*/
        Map<String, Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        //拿整体
        Stream<Map.Entry<String, Integer>> keyAndValueStream = map.entrySet().stream();

        /*---------------------------数组------------------*/
        String[] arr = {"123", "234", "345"};
        Stream<String> arrStream = Arrays.stream(arr);

        /*---------------------map加工--------------------*/
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张无极","张三丰","张山","李四");
        names.stream().map(s -> "sb" + s).forEach(s -> System.out.println(s));

        /*-----------------------加工成学生对象-------------------*/
        names.stream().map(s -> new Student(s)).forEach(s -> System.out.println(s));

        /*---------------------合并-------------------*/
        Stream<String> s1 = names.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("Sean", "Xiao");
        Stream<Object> s3 = Stream.concat(s1,s2);
        s3.forEach(s -> System.out.println(s));
    }
}
