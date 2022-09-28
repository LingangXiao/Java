package methods;

public class methods {
    public static void main(String[] args) {
        int d = sum(10,30);
        System.out.println(d);

        System.out.println(sum(5));

        EvenOrOdd(5);
        EvenOrOdd(8);

        int[] c = {4, 5, 6, 7, 8, 3, 2, 1};
        System.out.println(MaxInArray(c));

    }

    public static int sum (int a, int b){
        return a + b;
    }

    //计算1到n的和
    public static int sum(int n){
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    //判断整数是奇数还是偶数
    public static void EvenOrOdd(int n){
        if (n % 2 == 0){
            System.out.println("it is an even number");
        }
        else{
            System.out.println("it is an odd number");
        }
    }

    //求数组内最大值
    public static int MaxInArray(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //

}
