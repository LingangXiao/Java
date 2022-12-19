package CharStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("src\\IO\\data08.txt", true);

        writer.write("我是你爹");
        writer.write("im your dad", 0, 11);

        writer.close();
    }
}
