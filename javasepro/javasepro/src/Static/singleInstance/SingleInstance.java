package Static.singleInstance;

public class SingleInstance {
    //使用饿汉单例的设计步骤
    private SingleInstance() {

    }

    /*饿汉单例是在获取对象前，就已经准备好了一个
    * 这个对象只能是一个
    * 所以要用静态成员变量*/
    public static SingleInstance instance = new SingleInstance();

}
