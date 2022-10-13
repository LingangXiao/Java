package Static.util;

/*练习
* 完成数组工具类的设计
* */
public class ArrayUtil {
    private ArrayUtil() {
        //私有构造器
    }

    //静态方法
    public static String toString(int[] arr) {
        //做一些校验
        if (arr == null) {
            return null;
        }

        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length - 1 ? arr[i]: arr[i] + ", ");
        }
        result += "]";

        return result;
    }
}
