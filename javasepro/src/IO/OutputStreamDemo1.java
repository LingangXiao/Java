package IO;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("src\\IO\\data3.txt", true);
        //在后面写个true可以让电脑不清空之前的内容

        os.write('a');
        os.write(98);
        os.write(99);
        os.write("\r\n".getBytes()); //换行的方式

        byte[] buffer = {'a', 97, 98, 99};
        os.write(buffer);
        byte[] buffer2 = "我是中国人".getBytes();
        os.write(buffer2);

        //os.flush(); //一定要记住刷新数据
        os.close(); //写完了一定要关闭，可以节省内存，包含了flush方法，但是关闭后不可以使用了,建议写在最后面
    }
}
