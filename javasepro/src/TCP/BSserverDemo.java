package TCP;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BSserverDemo {
    public static void main(String[] args) throws Exception {
        try {
            ServerSocket ss = new ServerSocket(8888);
            while (true) {
                Socket socket = ss.accept();
                new ServerReaderThread(socket).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class ServerReaderThread extends Thread {
    private Socket socket;
    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");

            ps.println();

            ps.println("<span style='color:red;font-size:90px>我是你爹</span>");
            ps.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}