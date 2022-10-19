package polymorphic;

public class Test3 {
    /*从子类到父类，自动转换
    * 从父类到子类，强制转换👇
    * 必须进行强制的类型转换： 子类 对象变量 = （子类）父类类型的变量
    * 作用：可以调用子类独有的功能*/
    public static void main(String[] args) {
        //自动转换
        Animal a1 = new Dog();
        a1.run();

        //强制转换
        Animal a2 = new Turtle();
        a2.run();
        Turtle t = (Turtle) a2; // 强制转换的例子
        t.layEggs(); //强制转换后就可以调用独有的方法了
        //但是为了预防强制把乌龟转成狗，Dog d = (Dog) a2， a2很明显是一个新的乌龟类
        //java建议我们用instanceof的方法来检查下
        if (a2 instanceof Turtle) {
            Turtle t1 = (Turtle) a2;
            t1.layEggs();
        }
        else if (a2 instanceof Dog) {
            Dog d = new Dog();
            d.lookDoor();
        }
    }
}
