package TCP.multi;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    /*实现多发和多收*/
    public static void main(String[] args) {
        //1 创建socket通信管道
        try {
            System.out.println("client activated");
            Socket socket = new Socket("127.0.0.1", 7777);

            //2 从管道中创建一个输出流
            OutputStream os = socket.getOutputStream();

            //3 把低级的字节流包装成高级的打印流
            PrintStream ps = new PrintStream(os);

            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("请说： ");
                String msg = sc.nextLine();
                ps.println(msg);
                ps.flush();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
