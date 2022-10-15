package extend.feature;

public class Test {
    public static void main(String[] args) {
        /*
        * 继承的特点
        * 子类不能继承父类的构造器
        * 子类不能继承父类的私有成员
        * 子类可以共享父类的静态成员
        * java不支持多继承，但是可以多层继承
        * 不能有很多父类
        * 但是可以有一个父类，一个爷爷类
        * */
        Tiger t = new Tiger();
        t.run();
        System.out.println(Tiger.location);

        Dog d = new Dog();
        d.bark(); //如果子类和父类中有名字一样的方法，优先访问子类的
        d.lookDoor();
        d.name();
        /*当继承中出现了重名的成员
        * 优先看子类局部的成员
        * 然后看子类的成员
        * 再向上看继承的父类的成员
        * 如果一定要跳过子类的成员
        * 直接访问父类的成员的话
        * 需要加上super(要在子类中写)*/
    }
}
