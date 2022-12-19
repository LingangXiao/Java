package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(2525);

        /*public DatagramPacket(byte buf[], int length,
                          InetAddress address, int port)
          参数一 封装要发送的数据
          参数二 发送的大小
           参数三 对方的ip地址（服务端）
           参数四 对方的端口*/
        byte[] buffer = "我是一个韭菜".getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8888);

        socket.send(packet);

        socket.close();

    }
}
