package UDP.multipleSendAndRecieve;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*多发多收*/
public class ServerDemo1 {
    public static void main(String[] args) throws Exception {
        //创建接收端对象
        DatagramSocket socket = new DatagramSocket(8888);

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
