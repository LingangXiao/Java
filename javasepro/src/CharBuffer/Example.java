package CharBuffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {
    /*拷贝一个文件，并且恢复排序*/
    public static void main(String[] args) throws Exception{
        try (FileReader fr = new FileReader("src/CharBuffer/example1");
             BufferedReader br = new BufferedReader(fr);
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/CharBuffer/example2"));
             ) {
            List<String> data = new ArrayList<>();

            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            System.out.println(data);

            //排序
            Collections.sort(data);
            System.out.println(data);

            //如果开头并不是123，而是中文的一二三，可以用自定义排序规则
            /*List<String> sizes = new ArrayList<>();
            Collections.addAll(sizes, "一", "二", "三");*/
            //接下来就要用compare方法

            for (String datum : data) {
                bw.write(datum);
                bw.newLine(); //换行
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
