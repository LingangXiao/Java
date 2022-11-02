package APIs;

public class APIs {
    public static void main(String[] args) {
        Student s = new Student("sean", '男', 22);
        String rs = s.toString();
        System.out.println(rs);
        //或者直接输出对象变量, 相当于输出了s.toString
        System.out.println(s);

        Student s1 = new Student("sean", '男', 22);
        Student s2 = new Student("sean", '男', 22);
        System.out.println(s1.equals(s2)); //也需要在父类里面重写equals的方法

    }
}
