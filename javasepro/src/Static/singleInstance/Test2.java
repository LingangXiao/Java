package Static.singleInstance;

public class Test2 {
    public static void main(String[] args) {
        SingleInstance2 s1 = SingleInstance2.getInstance2();
        SingleInstance2 s2 = SingleInstance2.getInstance2();
        System.out.println(s1 == s2);
    }
}
