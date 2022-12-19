package TCP.smsExample;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerDemo {
    /*实现多发和多收*/

    //创建一个list集合来记录所有在线的管道
    public static List<Socket> allOnlineSockets = new ArrayList<>();
    public static void main(String[] args) {
        try {
            System.out.println("server activated");
            ServerSocket serverSocket = new ServerSocket(7777);

            //定义一个死循环由主线程负责不断地接受socket链接，每接受一个就分给一个子线程
            while (true) {
                //等待接收客户端的socket链接请求
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "他上线了");
                allOnlineSockets.add(socket);
                //每接收到一个socket就要交给一个独立的子线程来处理
                new MyServerReaderThread(socket).start();


            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
