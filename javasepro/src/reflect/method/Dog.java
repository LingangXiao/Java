package reflect.method;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }

    private String eat (String name) {
        System.out.println("dog eat" + name);
        return "have fun";
    }

    private void eat() {
        System.out.println("dog eat bones");
    }


}
