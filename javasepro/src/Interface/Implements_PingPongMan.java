package Interface;

public class Implements_PingPongMan implements SportMan, Law{
//必须要被重写，因为接口要被约束,一定要确保每一个方法都被重写

    private String name;

    public Implements_PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " have to run");
    }

    @Override
    public void competition() {
        System.out.println(name + " have to participate competitions");
    }

    @Override
    public void rule() {
        System.out.println(name + " have to follow the rules");
    }
}
