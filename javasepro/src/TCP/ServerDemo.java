package TCP;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    /*完成socket网络编程的入门服务端开发*/
    public static void main(String[] args) {
        try {
            System.out.println("server activated");
            ServerSocket serverSocket = new ServerSocket(7777);

            //等待接收客户端的socket链接请求
            Socket socket = serverSocket.accept();

            InputStream is = socket.getInputStream();

            //然后把字节输入流包装成缓冲字符输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String msg;
            if ((msg = br.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress() + "说了： " + msg);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
