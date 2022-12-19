package Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Serializable/date.txt"));
        Student s = (Student) ois.readObject();
        System.out.println(s);
    }
}
