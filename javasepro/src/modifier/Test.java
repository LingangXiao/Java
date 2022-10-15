package modifier;

import modifier.modifierExtends.Explain;

public class Test {
    /*private -> 缺省 -> protected -> public
       成员变量一般私有
       方法一般公开
       如果该成员只希望本类访问，就用private
       如果希望在同一个包下，和其他子类访问，就用protected

    * */
    public static void main(String[] args) {
        Explain e = new Explain();
        //e.privateMethod();
        //e.method(); 只能访问同包的，不同包就不能访问了
        //e.protectedMethod(); protected可以被不同包访问，但是需要是子类，不然也不可以
        e.publicMethod();

    }
}
