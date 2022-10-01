package param;

public class param {
    public static void main(String[] args) {
        //理解java的基本类型的参数传递：值传递
        int a = 10;
        change(a);
        System.out.println(a);// 10, 这里不会变成20，因为change方法里面的a = 20只是改变了方法内的a，并没有改变方法外面的a

    }

    public static void change(int a) {
        System.out.println(a); //10
        a = 20;
        System.out.println(a); //20
    }
}
