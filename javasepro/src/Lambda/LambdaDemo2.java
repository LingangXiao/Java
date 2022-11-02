package Lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
         /*Swimming s1 = new Swimming() {
             @Override
             public void swim() {
                 System.out.println("i swim fast");
             }
         };*/
        //以下就是上面的lambda简写格式
        Swimming s1 = () -> {
            System.out.println("i swim fast");
        };
        go(s1);
    }

    public static void go (Swimming s) {
        System.out.println("start");
        s.swim();
        System.out.println("end");
    }
}

interface Swimming {
    void swim();
}