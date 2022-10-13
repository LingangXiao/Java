package StaticDemo;

public class Test {

    /*静态成员
    * */
    public static int onlineNumber = 19;

    /*实例成员
    * */
    public String name;
    public void run() {
        System.out.println(name + "runs");
    }

    public static void test2() {
        System.out.println("test2");
    }

    //静态方法只能访问静态成员，不能直接访问实例成员
    public static void test() {
        System.out.println(onlineNumber);
        System.out.println(Test.onlineNumber);
        test2();

//        System.out.println(name);, 不能直接访问name或者run方法
        //除非创建一个对象先
        Test t = new Test();
        t.name = "Sean";
        System.out.println(t.name);
    }

    //实例方法可以访问静态成员，也可以访问实例成员
    public void go() {
        System.out.println(onlineNumber);
        System.out.println(name); //因为这个不是静态方法，是面对对象的实例方法，所以可以直接访问
        run();
    }

    //静态方法中不能出现this关键字
    public static void test3() {
        //System.out.println(this); 因为this是代表当前对象的，但静态方法不需要用对象
    }

    public static void main(String[] args) {
        //理解static，面试笔试题

    }
}
