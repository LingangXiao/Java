package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    /*如果相比较的不是数字，我们就需要用以下的api*/
    public static void main(String[] args) {
        int[] age = {23, 34, 456, 67};
        Arrays.sort(age);
        System.out.println(Arrays.toString(age));

        /*我们也可以自定义排序，但必须是引用类型排序，比如Integer， Double*/
        Integer[] age1 = {23, 34, 456, 67};
        Arrays.sort(age1, new Comparator<Integer>() {
            //我们可以自己重组排序的规则通过new Comparator
            @Override
            public int compare(Integer o1, Integer o2) {
                /*if (o1 > o2) {
                    return 1;
                }
                else if(o2 > o1) {
                    return -1;
                }
                return 0;*/
                //可以这么写是因为，系统默认左边大就返回正整数，右边大就返回负整数，一样就返回0
                //所以o1-o2是默认的升序，只需要加个负号就是降序了
                return - (o1 - o2);
            }
        });
        System.out.println("-----------------------------");
        Student[] students = new Student[3];
        students[0] = new Student("Sean", 22, 178);
        students[1] = new Student("Xiao", 23, 178);
        students[2] = new Student("Camille", 21, 160);
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
