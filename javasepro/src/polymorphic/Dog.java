package polymorphic;

public class Dog extends Animal{
    public String name = "son Dog";
    @Override
    public void run() {
        System.out.println("dog runs fast");
    }

    public void lookDoor() {
        System.out.println("looking door");
    }
}
