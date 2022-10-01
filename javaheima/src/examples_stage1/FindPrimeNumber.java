package examples_stage1;

public class FindPrimeNumber {
    // 判断101 - 200 之间有多少素数
    // 素数就是只能被1和自己整除
    public static void main(String[] args) {
        for (int i = 101; i < 201; i++) {
            boolean flag = true; //如果flag是true的时候，可以直接跳转到输出

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.print(i + "\t");
            }
        }
    }

}
