package Print;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintDemo {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("src/Print/ps.txt"), true);

        ps.println(87);
        ps.println("sdf");
        ps.println(true);

        //也可以修改语句输出的位置
        System.setOut(ps);
        //之后输出的东西就不会去控制台了
        System.out.println("春眠不觉晓");

        ps.close();
    }
}
