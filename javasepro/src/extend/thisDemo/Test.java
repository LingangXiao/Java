package extend.thisDemo;

public class Test {
    public static void main(String[] args) {
        /*理解this（...）的用法,访问兄弟构造器
        * this 和 super 一定要放在第一行
        * 所以this和super不能存在在一个构造器里
        * */
        Student s1 = new Student("Sean", "Iowa");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());

        Student s2 = new Student("Xiao");
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());
    }
}
