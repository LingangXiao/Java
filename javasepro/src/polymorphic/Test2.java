package polymorphic;

public class Test2 {
    //多态情况下，不能使用子类独有的方法
    public static void main(String[] args) {
        Animal a1 = new Dog();
        go(a1);
        //a1.lookDoor(); 不能使用狗类独有的功能
        Animal a2 = new Turtle();
        go(a2);
    }

    /*要求所有动物都要参加比赛*/
    public static void go(Animal a) {
        System.out.println("start");
        a.run();
        System.out.println("end");
    }
}
