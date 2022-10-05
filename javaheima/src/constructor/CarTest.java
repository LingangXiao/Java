package constructor;

public class CarTest {
    public static void main(String[] args) {
        //调用无参数构造器
        Car c = new Car();
        c.name = "BMW";
        c.price = 39.8;
        System.out.println(c);
        c.info();

        //调用有参数构造器
        Car c2 = new Car("Audi",38.0);
        System.out.println(c2.name);
        System.out.println(c2.price);
        c2.info();
    }
}
