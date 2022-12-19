package TCP.multi;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    /*实现多发和多收*/
    public static void main(String[] args) {
        try {
            System.out.println("server activated");
            ServerSocket serverSocket = new ServerSocket(7777);

            //定义一个死循环由主线程负责不断地接受socket链接，每接受一个就分给一个子线程
            while (true) {
                //等待接收客户端的socket链接请求
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "他上线了");
                //每接收到一个socket就要交给一个独立的子线程来处理
                new MyServerReaderThread(socket).start();

                /*InputStream is = socket.getInputStream();

                //然后把字节输入流包装成缓冲字符输入流
                BufferedReader br = new BufferedReader(new InputStreamReader(is));

                String msg;
                while ((msg = br.readLine()) != null) {
                    System.out.println(socket.getRemoteSocketAddress() + "说了： " + msg);
                }*/
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
