package Interface;

/*声明了一个接口，一定是公开的
* 接口是可以多继承的
* */
public interface Interface {
    /*
    * JDK 8 之前的接口中，只能由抽象方法和常量*/
    //常量
    public static final String SCHOOL_NAME = "IOWA";
    //抽象方法
    public abstract void run();

    //因为接口是默认公开的，所以可以省略public abstract
    String MY_NAME = "Sean";
    void eat();
}
