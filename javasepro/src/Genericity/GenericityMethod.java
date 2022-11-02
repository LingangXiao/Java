package Genericity;

public class GenericityMethod {
    public static void main(String[] args) {
        String[] names = {"Sean", "Xiao","armand"};

        Integer[] ages = {17,187,19};

    }

    public static <T> void printArray(T[] arr) {
        if (arr != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length ; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
            }
            sb.append("]");
            System.out.println(sb);
        }
        else {
            System.out.println(arr);
        }
    }
}
