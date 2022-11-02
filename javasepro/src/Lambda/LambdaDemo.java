package Lambda;

public class LambdaDemo {
    /*学会使用lambda的标准格式来简化匿名内部类*/
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("turtle runs slow");
            }
        };
        a.run();

        //Lambda只能简化函数式接口的匿名内部类
        /*什么是函数式接口呢
        * 必须是接口，而且接口中只能有一个抽象方法的形式
        * 我们通常会在接口上加上一个@FunctionalInterf注解*/


    }
}

abstract class Animal {
    public abstract void run();
}
