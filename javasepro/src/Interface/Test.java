package Interface;

public class Test {
    //理解接口的基本使用
    //被类实现
    public static void main(String[] args) {
        Implements_PingPongMan p = new Implements_PingPongMan("Zhang");
        p.run();
        p.competition();
        p.rule();
    }
}
