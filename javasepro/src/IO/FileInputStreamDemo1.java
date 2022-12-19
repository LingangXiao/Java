package IO;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //创建一个文件字节输入流管道
        InputStream is = new FileInputStream("src\\IO\\data.txt");

        /*//读取一个字节并且返回
        int b1 = is.read();
        System.out.println((char)b1);
        //如果继续往后读的话，会像水一样往后流。所以再读就是b1之后的
        int b2 = is.read();
        System.out.println((char)b2);*/

        //使用循环改进一下
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char)b);
        }

        //使用文件字节输入流管道
        InputStream is1 = new FileInputStream("src\\IO\\data.txt");
        /*//定义一个字节数组
        byte[] buffer = new byte[3];
        int len = is1.read(buffer);
        System.out.println("          ");
        System.out.println("读取了几个字节" + len);
        String rs1 = new String(buffer);
        System.out.println(rs1);*/

        //使用循环改进一下
        System.out.println("          ");
        byte[] buffer = new byte[3];
        int len;
        while ((len = is1.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
    }
}