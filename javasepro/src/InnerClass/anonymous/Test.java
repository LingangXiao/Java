package InnerClass.anonymous;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("tiger runs fast");
            }
        };
        a.run();
    }
}

abstract class Animal {
    public abstract void run();
}

/*class Tiger extends Animal {
    @Override
    public void run() {
        System.out.println("tiger runs fast");
    }
}
可以把整个重写的抽象方法放到新创造的对象后面，就是匿名内部类*/
