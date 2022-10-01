package param;

public class example {
    public static void main(String[] args) {
        //打印整型数组内容
        //设计一个方法用于输出任意整型数组的内容，要求输出成如下格式
        //“the array is ： 【11， 22， 33， 44， 55】”
        int[] arr = {10, 20, 30, 40, 50};
        printArray(arr);

    }

    public static void printArray(int[] arr){
        System.out.print("the array is : [ ");

        if(arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println("]");
    }
}
