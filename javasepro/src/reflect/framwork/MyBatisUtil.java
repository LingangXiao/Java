package reflect.framwork;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MyBatisUtil {
    public static void save (Object obj) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(new FileOutputStream("src/reflect/framwork/data.txt"));
        try {
            //1 提取这个对象的全部成员变量
            Class c = obj.getClass();
            printStream.println("=================" + c.getSimpleName() + "================");
            //2提取他的全部成员变量
            Field[] fields = c.getDeclaredFields();
            //3获取成员变量的信息
            for (Field field : fields) {
                String name = field.getName();
                //提取本成员变量在obj对象中的值
                field.setAccessible(true);
                String value = field.get(obj) + "";
                printStream.println(name + "=" + value);
            }
            printStream.close();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
