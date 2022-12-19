package File;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File f = new File("src/data.txt");
        System.out.println(f.exists());
        File f2 = new File("src/data2.txt.txt");
        System.out.println(f2.createNewFile());

        //创建一级目录
        File f3 = new File("D:\\Java\\aaa");
        System.out.println(f3.mkdir());

        //创建多级级目录
        File f4 = new File("D:\\Java\\aaa\\bbb\\ccc\\ddd");
        System.out.println(f4.mkdirs());

        System.out.println(f4.delete()); //只能删除空文件夹

        System.out.println("=======================================================");

        File f5 = new File("D:\\Java");
        String[] names = f5.list();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("=========================================");
        File f6 = new File("D:\\Java");
        File[] names1 = f6.listFiles();
        for (File name : names1) {
            System.out.println(name);
        }

    }
}
