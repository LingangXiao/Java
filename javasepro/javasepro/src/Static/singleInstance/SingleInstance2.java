package Static.singleInstance;

public class SingleInstance2 {
    //学习懒汉单例
    //懒汉单例是获取对象时才生成
    private SingleInstance2() {}

    //最好私有化，避免让别人直接点击调用
    private static SingleInstance2 instance2; // = new SingleInstance2(); 这里不能new，不然就变成饿汉单例了

    //提供一个方法，对外返回单例对象
    public static SingleInstance2 getInstance2() {
        if (instance2 == null) {
            //第一次来拿对象
            //我们也是在这里创建对象的
            instance2 = new SingleInstance2();
        }
        return instance2;
    }
}
