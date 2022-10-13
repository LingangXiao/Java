package Static.code;

public class StaticDemo1 {
    //理解静态代码块
    //在main方法外面的一个static + {} 就是静态代码块，属于类
    //无论在main方法前面或者后面，都优先执行

    //作用：可以初始化静态资源

    public static String schoolName;

    /*静态代码块*/
    static {
        System.out.println("---------静态代码块触发----------");
        schoolName = "UI";
    }


    public static void main(String[] args) {
        System.out.println("main方法触发");
        System.out.println(schoolName); //这时的schoolName已经有内容了
    }
}
