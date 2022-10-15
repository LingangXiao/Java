package modifier.modifierExtends;

public class Explain2 {
    public static void main(String[] args) {
        Explain e = new Explain();
        //e.privateMethod();
        e.method();
        e.protectedMethod();
        e.publicMethod();
        //private不可以访问了
    }
}
