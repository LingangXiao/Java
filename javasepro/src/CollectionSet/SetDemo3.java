package CollectionSet;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
    /*创建一个存储学生对象的set集合
    * 存储多个学生对象
    * 并且去掉重复的对象*/
    public static void main(String[] args) {
        Set<Student> sets = new HashSet<>();
        Student s1 = new Student("Sean",18,'M');
        Student s2 = new Student("Xiao",19,'M');
        Student s3 = new Student("Armand",20,'M');
        Student s4 = new Student("Sean",18,'M');

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        sets.add(s4);
        System.out.println(sets); //记得要重写hashcode和equals的方法

    }
}
