package UDP.multicast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*多发多收*/
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(7777);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说： ");
            String msg = sc.nextLine();

            byte[] buffer = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length,
                    InetAddress.getByName("224.0.1.1"), 8888);

            if ("exit".equals(msg)) {
                System.out.println("离线成功");
                socket.close();
                break;
            }
            socket.send(packet);
        }
    }
}
