package UDP.multicast;

import java.net.*;

/*多发多收*/
public class ServerDemo1 {
    public static void main(String[] args) throws Exception {
        //创建接收端对象
        MulticastSocket socket = new MulticastSocket(8888);

        //把当前的接收端加入到一个组播组中
        //socket.joinGroup(InetAddress.getByName("224.0.1.1"));
        socket.joinGroup(new InetSocketAddress(InetAddress.getByName("224.0.1.1"), 8888), NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));

        //创建一个盘子来接数据
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            socket.receive(packet);

            int len = packet.getLength();
            String rs = new String(buffer,0, len);
            System.out.println("收到了来自" + packet.getAddress() + ", 对方的端口是" + packet.getPort() + "的消息：" + rs);

        }
    }
}
