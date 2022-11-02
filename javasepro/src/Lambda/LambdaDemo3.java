package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer[] age1 = {23, 34, 456, 67};

        // 我们可以直接ctrl加点击    👇    ， 如果源代码里面有functionalInterfa的注解，就可以简化
        Arrays.sort(age1, new Comparator<Integer>() {
            //我们可以自己重组排序的规则通过new Comparator
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        //这就是简化完的样子
        Arrays.sort(age1, (Integer o1, Integer o2) -> o2 - o1);
    }
}
