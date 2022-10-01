package param;

public class param2 {
    public static void main(String[] args) {
        //引用类型的参数传递机制：值传递
        int [] arrs = {10, 20, 30};
        change(arrs);
        System.out.println(arrs[1]); //222, 因为这次main方法里面的change方法是传送了arrs的地址，并不是里面的数字
    }

    public static void change(int[] arrs) {
        System.out.println(arrs[1]); //20
        arrs[1] = 222;
        System.out.println(arrs[1]); //222

    }
}
