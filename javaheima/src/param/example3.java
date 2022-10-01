package param;

public class example3 {
    //比较两个数组是否一样
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {10, 20, 30};
        System.out.println(sameArray(arr1, arr2));
    }

    public static boolean sameArray (int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
