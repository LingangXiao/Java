package InnerClass;

public class Outer {
    //学习静态成员内部类
    public static int a = 100;

    public static class Inner {
        private String name;
        private int age;
        //什么都可以，就和平常的外部类一样，可以创建方法，或者getter setter

        public void show() {
            System.out.println(name);
            System.out.println(a);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public class Inner1 {
        //成员内部类，不可以加static修饰
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static int getA() {
            return a;
        }

        public static void setA(int a) {
            Inner1.a = a;
        }

        public static int a = 100; //只有jdk 16 之后才支持静态成员

    }
}
