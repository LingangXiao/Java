package File;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("D:\\Java\\eason.jpg");
        long size = f.length();
        System.out.println(size);

        //相对路径,用来定位模块中的文件
        File f2 = new File("src/data.txt");
        long size1 = f2.length();
        System.out.println(size1);
        System.out.println(f2.exists());

        System.out.println(f.getAbsolutePath());
        long time = f.lastModified();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time));
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.isFile());
    }
}
