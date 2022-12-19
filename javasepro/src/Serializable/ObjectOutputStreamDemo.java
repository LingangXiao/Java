package Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        Student s = new Student("Lingang", "Sean", "123456", 20);

        //对象序列化，使用对象字节输出流包装字节输出流管道
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Serializable/date.txt"));

        oos.writeObject(s);
        oos.close();
        System.out.println("序列化完成");
    }
}
