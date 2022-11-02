package APIs.StringBuilder;

public class TEst {
    /*打印整型数组内容
    * 设计一个方法用于输出任意整型数组的内容，要求输出成如下格式
    * “该数组内容为：【11，22，33，44，55】”*/
    public static void main(String[] args) {
        int[] arr1 = null;
        System.out.println(jieShou(arr1));
        int[] arr2 = {11,22,33,44,55};
        System.out.println(jieShou(arr2));
    }

    //定义一个方法用来接受任意整型数组，并且返回数组内容格式
    public static String jieShou(int[] arr) {
        if (arr != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ",");
            }
            sb.append("]");
            return sb.toString();
        }
        else {
            return null;
        }
    }
}
