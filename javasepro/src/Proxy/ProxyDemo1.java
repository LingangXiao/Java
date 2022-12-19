package Proxy;

public class ProxyDemo1 {
    /*理解动态代理的执行流程，并学习开发*/
    public static void main(String[] args) {
        //创建一个类，必须实现接口
        Star star = new Star("ycy");
        Skills s2 = StarAgent.getProxy(star);
        s2.jumps();
        s2.sings();
    }
}
