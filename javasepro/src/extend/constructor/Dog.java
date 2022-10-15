package extend.constructor;

public class Dog extends Animal{
    public Dog() {
        System.out.println("子类dog无参数构造器被执行");
    }
    public Dog(String name) {
        System.out.println("子类dog有参数构造器被执行");
    }

    public Dog(String name, int age) {
        //要调用父类的有参数构造器
        super(name, age);

    }

}
