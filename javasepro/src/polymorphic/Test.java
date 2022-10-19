package polymorphic;

public class Test {
    /*多态的前提：
    * 有继承或者实现关系
    * 有父类引用指向子类对象
    * 有方法重写
    * 多态的好处：
    * 方便修改，比如当我突然不需要Dog run了，可以直接替换成其他继承Animal的动物
    * */
    public static void main(String[] args) {
        //多态的形式
        //直接用大的父类来定义新的子类就是多态，因为Animal包含了Dog和Turtle
        //Dog a = new Dog();
        Animal a = new Dog();//方法调用：编译看左边，运行看右边
        a.run();
        System.out.println(a.name); //变量调用：编译看左，运行也看左边

        //Turtle a2 = new Turtle();
        Animal a2 = new Turtle();
        a2.run();
        System.out.println(a2.name);
    }
}
