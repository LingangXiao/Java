package resource;

import java.io.*;

public class TryCatchResourceDemo2 {
    public static void main(String[] args) throws Exception {
        try {
            InputStream is = new FileInputStream("src\\IO\\data2.txt");
            OutputStream os = new FileOutputStream("src/resource/data5.txt");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1 ) {
                os.write(buffer, 0, len);
            }
            System.out.println("copy ok");
            os.close();
            is.close();
            //os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


