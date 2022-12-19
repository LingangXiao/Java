package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerDemo1 {
    public static void main(String[] args) throws Exception {
        //创建接收端对象
        DatagramSocket socket = new DatagramSocket(8888);

        //创建一个盘子来接数据
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        socket.receive(packet);

        int len = packet.getLength();
        String rs = new String(buffer,0, len);
        System.out.println(rs);

        String ip = packet.getSocketAddress().toString();
        System.out.println(ip);

        int port = packet.getPort();
        System.out.println(port);

        socket.close();
    }
}
