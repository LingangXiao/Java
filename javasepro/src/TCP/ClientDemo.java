package TCP;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ClientDemo {
    /*完成socket网络编程的入门客户端开发*/
    public static void main(String[] args) {
        //1 创建socket通信管道
        try {
            System.out.println("client activated");
            Socket socket = new Socket("127.0.0.1", 7777);

            //2 从管道中创建一个输出流
            OutputStream os = socket.getOutputStream();

            //3 把低级的字节流包装成高级的打印流
            PrintStream ps = new PrintStream(os);

            ps.println("我是TCP客户端，我已经与你对接");
            ps.flush();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
