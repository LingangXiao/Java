package encapsulation;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = -120;
        System.out.println(s.age); //这个是符合编程逻辑的，但是不符合做软件的逻辑，因为没有人可以活到负的120岁

        Student s1 = new Student();
        s1.setAge1(-25);
        System.out.println(s1.getAge1());
    }
}
