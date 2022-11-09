package Nov2_Map;

import java.util.*;

public class VoteExample {
    /*投票统计人数
    * 80个学生，每个人可以选多个景点
    * 统计人气最高的经典*/
    public static void main(String[] args) {
        Map<String, List<String>> data = new HashMap<>();

        //把学生选择的数据存进去
        List<String> select = new ArrayList<>();
        Collections.addAll(select, "a", "b");
        data.put("Sean", select);

        List<String> select1 = new ArrayList<>();
        Collections.addAll(select1, "a", "b", "c");
        data.put("Xiasoso", select1);
        System.out.println(data);

        //统计每个景点选择的人数
        Map<String, Integer> infos = new HashMap<>();

        //提取所有人选择的景点的信息
        Collection<List<String>> values = data.values();
        for (List<String> value : data.values()) {
            for (String s : value) {
                if (infos.containsKey(s)) {
                    infos.put(s, infos.get(s) + 1);
                }
                else {
                    infos.put(s, 1);
                }
            }
        }
        System.out.println(infos);

    }
}
