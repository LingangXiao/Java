package IO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSet {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码，把文字转换成字节
        String name = "abc我爱你中国";
        byte[] bytes = name.getBytes(); //以当前默认字符集进行编码
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        //也可以用GBK的方式编码
        byte[] bytes1 = name.getBytes("GBK"); //以当前默认字符集进行编码
        System.out.println(bytes1.length);
        System.out.println(Arrays.toString(bytes1));

        //编码前和编码后的字符集一定要一致
        String rs = new String(bytes);
        System.out.println(rs);
        String rs1 = new String(bytes1, "GBK");
        System.out.println(rs1);
    }
}
