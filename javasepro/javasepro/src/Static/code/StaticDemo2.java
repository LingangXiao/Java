package Static.code;

public class StaticDemo2 {
    //理解实例代码块

    private String name;

    public StaticDemo2() {
        System.out.println("无参数构造器被触发执行");
    }
    /*实例代码块
    * 无static修饰，属于对象，每次构造对象的时候，都会触发一次执行,要比构造器优先
    * 一般不会初始化实例资源
    * 因为会导致每次创建的对象都一样
    **/
    {
        System.out.println("实例代码块被触发执行");
        name = "Sean";
    }

    public static void main(String[] args) {
        StaticDemo2 s1 = new StaticDemo2();
        System.out.println(s1.name);
        StaticDemo2 s2 = new StaticDemo2();
        System.out.println(s2.name);
    }
}
