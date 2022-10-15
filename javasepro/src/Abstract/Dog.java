package Abstract;

public class Dog extends Animal{
    @Override
    public void run() { //抽象的父类会强制子类重写方法
        System.out.println("狗跑的很快");
    }
}
