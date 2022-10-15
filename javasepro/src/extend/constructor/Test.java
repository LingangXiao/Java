package extend.constructor;

public class Test {
    public static void main(String[] args) {
        //认识继承后子类构造器的特点
        //子类的全部构造器都会默认先访问父类的无参数构造器，再访问自己
        // 因为子类初始化之前，父类构造器一定要先完成初始化
        Dog d = new Dog();
        System.out.println(d);
        Dog d2 = new Dog("金毛");
        System.out.println(d2);
        System.out.println("--------------------");

        Dog d3 = new Dog("jl",1);
        /*d3.setName("jl");
        d3.setAge(1);
        因为我们已经调用了有参数构造器，所以可以直接在new Dog后面加名字和年龄
        可以节省两行代码
        */
    }
}
