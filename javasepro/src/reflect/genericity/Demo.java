package reflect.genericity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        arrayList2.add(23);
        //arrayList2.add("ww");

        //但是我们可以用反射的方法来添加string到int的arraylist里
        Class c = arrayList2.getClass();
        Method add = c.getDeclaredMethod("add", Object.class);
        boolean rs = (boolean) add.invoke(arrayList2,"Sean");

        System.out.println(arrayList2);
    }
}
