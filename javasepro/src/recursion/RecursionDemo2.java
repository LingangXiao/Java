package recursion;

import java.io.File;

public class RecursionDemo2 {
    public static void main(String[] args) {
        //文件搜索
        searchFile(new File("D:/"), "bubblesort.java");
    }

    public static void searchFile(File dir, String fileName) {
        if (dir != null && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null && files.length > 0) {
                for (File file : files) {
                    //判断当前便利的一级文件
                    if (file.isFile()) {
                        if (file.getName().contains(fileName)) {
                            System.out.println("found : " + file.getAbsolutePath());
                            //可以直接启动
                            /*Runtime r = Runtime.getRuntime();
                            r.exec(file.getAbsolutePath());
                            可以启动所有的exe软件，但是只有exe软件 */
                        }
                    }
                    else {
                        searchFile(file, fileName);
                    }
                }
            }
        }
        else {
            System.out.println("您搜索的不是文件夹");
        }
    }
}
