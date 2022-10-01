package param;

public class example2 {
    public static void main(String[] args) {
        //从数组中查询指定的元素的索引
        //输入一个数组中的数字，返回这个数字的index，如果数组中的没有这个数字，返回-1

        int[] arr = {10, 20, 30, 40, 50, 60};
        int index = searchIndex(arr, 70);
        System.out.println("the index of your number is : " + index);

    }

    public static int searchIndex(int[] arr, int data){
        //开始找出data在arr里面的index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1; //如果上面的for loop找不到，证明查找的数不在这个array里，所以返回-1
    }
}
