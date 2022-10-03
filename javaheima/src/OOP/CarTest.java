package OOP;

public class CarTest {
    public static void main(String[] args) {
        Car c = new Car(); //创建一个汽车对象
        c.name = "BMW";
        c.price = 7 ;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start(); //可以直接从Car的java文件中提取方法
        c.run();

        Car c2 = new Car();
        c.name = "Benz";
        c.price = 8 ;
        c.start();
        c.run();

    }
}
