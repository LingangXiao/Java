package CharBuffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        /*改进为高级的写法*/
        Writer writer = new FileWriter("src\\IO\\data09.txt", true);
/*
        bw.write("我是你爹");
        bw.write("im your dad", 0, 11);

        bw.close();*/

        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("我是你爹");
        bw.write("im your dad", 0, 11);
        bw.newLine();
        bw.write("adc");

        bw.close();
    }
}
