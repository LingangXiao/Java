package CharBuffer;

import java.io.*;

public class BufferReaderDemo {
    public static void main(String[] args) throws Exception {
        /* 把低级的字符流转换成高级的缓冲字符流*/
        try (Reader fr = new FileReader("src\\IO\\data2.txt");
             BufferedReader br = new BufferedReader(fr);
            ) {
            /*int code;
            while ((code = fr.read()) != -1) {
                System.out.print((char) code);
            }*/
            /*char[] buffer = new char[1024];
            int len;
            while ((len = fr.read(buffer)) != -1) {
                String rs = new String(buffer, 0, len);
                System.out.println(rs);
            }*/
            /*System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());*/
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
