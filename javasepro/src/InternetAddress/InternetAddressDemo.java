package InternetAddress;

import java.net.InetAddress;

public class InternetAddressDemo {
    public static void main(String[] args) throws Exception {
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        //也可以直接找到网址的IP地址
        InetAddress ip2 = InetAddress.getByName("www.google.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        //也可获取公网IP对象
        InetAddress ip3 = InetAddress.getByName("112.80.248.76");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());

        //判断能否在几秒内联通
        System.out.println(ip3.isReachable(5000));
    }
}
