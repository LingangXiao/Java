package APIs.StringBuilder;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("start");
        //System.exit(0); 直接终止JVM
        /*long time = System.currentTimeMillis();
        System.out.println(time);

        for (int i = 0; i < 100000; i++) {
            System.out.println("output: " + i);
        }

        long endtime = System.currentTimeMillis();
        System.out.println((endtime - time)/1000.0 + "s");*/

        int[] arr1 = {10,20,30,40,50,60,70};
        int[] arr2 = new int[6];
        System.arraycopy(arr1, 3, arr2, 2, 3);
        System.out.println(Arrays.toString(arr2));

        System.out.println("end");
    }
}
