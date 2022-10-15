package modifier;

import modifier.modifierExtends.Explain;

public class Zi extends Explain {
    public static void main(String[] args) {
        Explain e = new Explain();
        //e.privateMethod();
        //e.method(); 只能访问同包的，不同包就不能访问了
        //e.protectedMethod(); 为什么还不可以呢，因为不能用父类对象来访问，必须要子类对象才可以
        Zi z = new Zi();
        z.protectedMethod(); // 需要再新建一个子类的对象，这样就可以使用protected了
        e.publicMethod(); //在哪都能能调用
    }
}
