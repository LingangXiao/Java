package Interface;

public class Attention {
    /*
    * 1 接口不能创建对象
    * 2 一个类实现多个接口，多个接口中有同样的静态方法不冲突
    * 3 一个类继承了父类，同时又实现了接口，父类中和接口中有同名的方法，默认用父类的
    * 4 一个类实现了多个接口，多个接口中存在同名的默认方法，不冲突，这个类重写该方法即可
    * 5 一个接口继承多个接口，是没有问题的，如果多个接口中存在的规范冲突，则不能多继承
    * */

}

/*4*/
interface AA {
    default void go() {
        System.out.println("AA");
    }
}

interface BB {
    default void go() {
        System.out.println("BB");
    }
}

class CC implements AA, BB {
    //default是不能像static一样，直接用接口名字+方法调用

    @Override
    public void go() {
        //可以重写一个方法自己用，不能再回去用AA或者BB的方法
    }
}

/////////////////////////////////////////////////////////////////////////////////////////

/*3
* 一个类继承了父类，同时又实现了接口，父类中和接口中有同名的方法，默认用父类的*/

interface Food {
    default void eat(){
        System.out.println("inter eat");
    }
}

class Animal {
    public void eat(){
        System.out.println("eat");
    }
}

class Cat extends Animal implements Food {
    //优先使用父类的
}

//////////////////////////////////////////////////////////////////////////////////////

interface A {
    static void test() {
        System.out.println("A");
    }
}

interface B {
    static void test() {
        System.out.println("B");
    }
}

class C implements A,B {
    // 不用担心接口中的静态方法重名，因为只能当前的接口才能调用静态方法
    public static void main(String[] args) {
        //C.test();
        A.test();
        B.test(); //A 调用A的，B调用B的，所以静态方法重名无所谓
    }
}