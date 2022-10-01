package param;

public class example4 {
    public static void main(String[] args) {
        //理解方法重载，就是一个方法可以通过输入不同的input来输出不同的内容
        fire();
    }

    public static void fire() {
        System.out.println("fire to Mi");
        //也可以在方法中调用方法
        fire("nihong");
    }

    public static void fire(String location) {
        System.out.println("fire to " + location);
    }

    public static void fire(String location, int num) {
        System.out.println("fire to " + location + " with " + num + " bullets");
    }
}
