package TCP.smsExample;

import java.io.*;
import java.net.Socket;

public class MyServerReaderThread extends Thread{
    private Socket socket;

    public MyServerReaderThread(Socket socket) {
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
                System.out.println(socket.getRemoteSocketAddress() + "说了： " + msg);
                //把这个消息发送给客户端
                sendMsgToAll(msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
            ServerDemo.allOnlineSockets.remove(socket);
        }
    }

    private void sendMsgToAll(String msg) throws IOException {
        for (Socket socket : ServerDemo.allOnlineSockets) {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println(msg);
            ps.flush();
        }
    }
}
