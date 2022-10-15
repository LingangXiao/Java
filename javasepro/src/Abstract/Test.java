package Abstract;

public class Test {
    /*我们可以把抽象类理解成不完整的设计图
    * 一般作为父类，让子类来继承
    * 当父类知道子类一定要完成某些行为，但是每个子类该行为的实现又不同
    * 于是父类就把该行为定义为抽象方法的形式
    * 具体实现交给子类去完成
    * 抽象类是不能够创造对象的
    * 因为如果抽象类可以创造对象
    * Animal a = new Animal（）；
    * 因为里面根本没有方法
    * */
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
    }

}
