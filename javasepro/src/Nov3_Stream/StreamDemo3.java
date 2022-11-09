package Nov3_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo3 {
    /*某个公司的开发部门，分为一部和二部
    * 现在需要进行年中数据总结
    * 员工信息至少包含了名称，性别，工资，奖金和处罚记录
    * 一部有4个人，二部有5个人
    * 分别筛选出两个部门最高工资的员工信息，封装成优秀员工对象*/

    public static int allMoney = 0;
    public static int allMoney2 = 0; //两个部门去掉最高工资和最低工资的总和

    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("Sean1","male",40000,20000,null));
        one.add(new Employee("Sean2","male",50000,30000,null));
        one.add(new Employee("Sean3","male",60000,40000,"fight"));
        one.add(new Employee("Sean4","male",70000,50000,null));

        List<Employee> two = new ArrayList<>();
        two.add(new Employee("Sean5","male",40000,20000,null));
        two.add(new Employee("Sean6","male",50000,30000,null));
        two.add(new Employee("Sean7","male",60000,60000,"fight"));
        two.add(new Employee("Sean8","male",70000,70000,"late"));
        two.add(new Employee("Sean9","male",80000,80000,null));

        BestEmployee be = one.stream().max((e1, e2) -> Integer.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus())).map(s -> new BestEmployee(s.getName(), s.getSalary() + s.getBonus())).get();
        System.out.println(be);
        BestEmployee be2 = two.stream().max((e1, e2) -> Integer.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus())).map(s -> new BestEmployee(s.getName(), s.getSalary() + s.getBonus())).get();
        System.out.println(be2);

        //平均每工资，去掉最高和最低
        one.stream().sorted((e1, e2) -> Integer.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus()))
                .skip(1).limit(one.size() - 2).forEach(s -> {
                    allMoney += (s.getBonus() + s.getSalary());
        });
        System.out.println(allMoney / (one.size() - 2));

        //合并两个集合流，再统计
        Stream<Employee> s1 = one.stream();
        Stream<Employee> s2 = two.stream();
        Stream<Employee> s3 = Stream.concat(s1,s2);
        s3.sorted((e1, e2) -> Integer.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus()))
                .skip(1).limit(one.size() + two.size() - 2).forEach(s -> {
                    allMoney2 += (s.getBonus() + s.getSalary());
                });
        System.out.println(allMoney2 / (one.size() + two.size() - 2));


    }
}
