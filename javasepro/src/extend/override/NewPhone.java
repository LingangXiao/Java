package extend.override;

public class NewPhone extends Phone{
    /*当我们需要父类中的方法，但是父类的方法又不够全面的时候
    * 我们可以在子类中override那个方法
    * 只需要把方法copy下来后
    * 用super.我们要用的方法，就可以重新写方法了
    * 逻辑是，先运行父类中的这个方法
    * 然后再运行我们在子类中后添加的super.的方法
    * 重写方法的名称和参数必须一直
    * 私有方法是不可以重写的
    * 静态方法不能被重写，因为静态方法是共享，不是继承*/
    @Override
    public void call() {
        super.call();
        System.out.println("video call");
    }

    @Override
    public void msg() {
        super.msg();
        System.out.println("send imessage");
    }
}
