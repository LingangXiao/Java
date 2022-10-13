package StaticDemo;

public class Student {

    /*
    * 实例成员变量：无static修饰，属于对象
    * */
    private String name;

    /*
    * 静态成员方法：有static修饰，归属于类，可以被共享访问，可以用类名和对象名访问
    * */
    public static int getMax(int age1, int age2) {
        return age1 > age2 ? age1 : age2;
    }

    /*
    * 实例方法
    * */
    public void study() {
        //属于对象的，只能用对象才能触发访问
        System.out.println(name + " good good study");
    }

    public static void main (String[] args) {
        //用类名访问静态成员方法
        System.out.println(Student.getMax(10, 3));
        //在同一个类中，访问静态方法可以省略类名
        System.out.println(getMax(10,49));

        //study(); 实例就不能像静态一样，直接访问，需要一个对象来访问
        Student s = new Student();
        s.name = "Sean";
        s.study();
    }



}
