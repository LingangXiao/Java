package resource;

import java.io.*;

public class TryCatchFinallyDemo1 {
    public static void main(String[] args) throws Exception {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream("src\\IO\\data2.txt");
            os = new FileOutputStream("src/resource/data5.txt");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1 ) {
                os.write(buffer, 0, len);
            }
            System.out.println("copy ok");
            //os.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //finally里面的就是无论前面的代码成功与否，一定会运行
            System.out.println("===========final==================");
            os.close();
            is.close();
        }
    }
}
