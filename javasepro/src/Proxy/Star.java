package Proxy;

public class Star implements Skills {
    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void jumps() {
        System.out.println(name + " start jumping");
    }

    @Override
    public void sings() {
        System.out.println(name + " start singing");
    }
}
