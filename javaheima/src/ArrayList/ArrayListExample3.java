package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample3 {
    public static void main(String[] args) {
        //学生信息系统数据搜索
        //后台程序需要储存学生信息并展示，然后按照学号提供搜索学生信息的功能
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("20180302", "陆小果", 15, "一班"));
        students.add(new Student("20180303", "菠萝吹雪", 17, "二班"));
        students.add(new Student("20180304", "橙留香", 16, "三班"));
        students.add(new Student("20180305", "东方不败", 18, "四班"));

        for (int i = 0; i < students.size(); i++) {
            Student studentInfo = students.get(i);
            System.out.println(studentInfo.getId());
            System.out.println(studentInfo.getName());
            System.out.println(studentInfo.getAge());
            System.out.println(studentInfo.getClassroom());
            System.out.println("-----------------------");
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please enter the id of the student");
            String inputId = sc.next();
            Student s1 = searchStudentById(students, inputId);
            if (s1 == null) {
                System.out.println("invalid id");
            }
            else {
                System.out.println("this is the student you are searching");
                System.out.println(s1.getId() +"\t"+ s1.getName() +"\t"+ s1.getAge() +"\t"+ s1.getClassroom());
            }
        }

    }

    /**
     * 通过学号来找到每一个学生
     *
     * @param students - 一个包含所有学生的arraylist
     * @param id - 学生的学号
     * @return 学生对象或者null
     */
    public static Student searchStudentById (ArrayList<Student> students, String id) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId().equals(id)) {
                //证明这个学生就是我们要找的
                return s;
            }
        }
        return null;
    }
}
