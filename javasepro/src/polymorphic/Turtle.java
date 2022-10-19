package polymorphic;

public class Turtle extends Animal{
    public String name = "son Turtle";
    @Override
    public void run() {
        System.out.println("turtle runs slow");
    }

    public void layEggs() {
        System.out.println("lay eggs");
    }
}
