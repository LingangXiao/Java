package Interface.multi;

public interface SportManInter {
    /*默认方法
    * 必须用default修饰，默认用public修饰
    * 默认方法，接口不能创建对象，这个方法只能过继给了实现类，由实现类对象调用*/
    default void run() {
        System.out.println("lets run");
        FSS(); // 只能在这个接口的内部调用
    }

    /*静态方法
     * 必须使用static修饰，默认用public
     * 接口的静态方法，必须用接口名调用,具体见36行*/
    static void inAddr() {
        System.out.println("we are learning java");
    }

    /*私有方法
    * JDK 1.9 后才可以使用
    * 必须在接口内部才能被访问*/
    private void FSS() {
        System.out.println("FSS"); // 第9行
    }
}


class PingPongMan implements SportManInter {

}

class Test {
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run(); //pingpongman里面没有run方法，就会从自己接入的地方找默认方法
        SportManInter.inAddr(); //必须用方法所在的接口才能调用静态方法
        //PingPongMan.inAddr(); 就算PingPongMan已经接入了，也不可以
    }
}