package operater;

public class operater {
    public static void main (String[] args){
        int a, b;
        a = 10;
        b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b); // 因为a和b都是int，所以结果不会是3.333，而是3
        // 如果需要答案是小数，需要先把a 变成double
        System.out.println(a * 1.0 / b); // 这样结果就会是有小数的
        System.out.println(a * b);
    }
}
