package CharStream;

import java.io.FileReader;
import java.io.Reader;

public class CharStreamDemo1 {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("src\\IO\\data2.txt");
        /*int code = fr.read();
        System.out.println((char) code);*/
        //可以用循环来简化
        int code;
        while ((code = fr.read()) != -1) {
            System.out.print((char) code);
        }

        char[] buffer = new char[1024];
        int len;
        while ((len = fr.read(buffer)) != -1) {
            String rs = new String(buffer, 0, len);
            System.out.println(rs);
        }
    }
}
