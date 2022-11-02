package InnerClass;

public class Test {
    public static void main(String[] args) {
        /*静态内部类访问的格式*/
        Outer.Inner in = new Outer.Inner();
        in.setName("Sean");
        in.show();

        /*成员内部类格式*/
        Outer.Inner1 in1 = new Outer().new Inner1();
        in1.setName("xiao");
    }

}
