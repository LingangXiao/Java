package TCP.multiAdvance;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerDemo{
    /*实现多发和多收*/
    //使用静态变量创建一个线程池对象
    private static ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        try {
            System.out.println("server activated");
            ServerSocket serverSocket = new ServerSocket(6666);

            //定义一个死循环由主线程负责不断地接受socket链接，每接受一个就分给一个子线程
            while (true) {
                //等待接收客户端的socket链接请求
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "他上线了");
                //每接收到一个socket就要交给一个独立的子线程来处理
                Runnable target = new MyServerReaderThread(socket);
                pool.execute(target);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
