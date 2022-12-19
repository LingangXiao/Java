package TCP.smsExample;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
    /*实现多发和多收*/
    //客户端可以随时接收消息
    public static void main(String[] args) {
        //1 创建socket通信管道
        try {
            System.out.println("client activated");
            Socket socket = new Socket("127.0.0.1", 7777);

            //需要创建一个线程专门来负责客户端的读消息
            new MyClientReaderThread(socket).start();

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

class MyClientReaderThread extends Thread {
    private Socket socket;

    public MyClientReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();

            //然后把字节输入流包装成缓冲字符输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String msg;
            while ((msg = br.readLine()) != null) {
                System.out.println("收到： " + msg);
            }
        } catch (Exception e) {
            System.out.println("服务端把你踢出群聊");
        }
    }
}