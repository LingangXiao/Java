package IO;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("src\\IO\\data2.txt");
        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));
    }
}
