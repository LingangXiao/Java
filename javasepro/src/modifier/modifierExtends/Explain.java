package modifier.modifierExtends;

public class Explain {
    /*
    * 定义私有的成员： private 只能在本类中访问
    * */
    private void privateMethod() {
        System.out.println("---private---");
    }

    /*
    * 缺省修饰的成员：只能在本类中，同包下其他类访问
    * */
    void method () {
        System.out.println("---缺省---");
    }

    /*protected修饰方法： 本类，通报中的其他类中，其他包的子类中*/
    protected void protectedMethod() {
        System.out.println("---protected---");
    }

    /*
    * public修饰方法： 本类，同胞的其他类中，其他包的子类中，其他包无关类中*/
    public void publicMethod() {
        System.out.println("---public---");
    }

    public static void main(String[] args) {
        Explain e = new Explain();
        e.privateMethod();
        e.method();
        e.protectedMethod();
        e.publicMethod();
        //本类中，四个都可以访问
    }
}
