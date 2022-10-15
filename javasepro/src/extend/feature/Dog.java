package extend.feature;

public class Dog extends Animal{
    public String name = "jl";
    public void lookDoor() {
        System.out.println("看门");
    }

    public void bark() {
        System.out.println("bark bark");
    }

    public void name() {
        System.out.println(name);
        System.out.println(super.name); //显示父类的name
    }
}
