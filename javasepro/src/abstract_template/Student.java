package abstract_template;

public abstract class Student {
    //模板方法
    //创建抽象类
    //建议都用final来防止子类重写
    public void write() {
        System.out.println("\t\t\t\t\t<my dad>");
        System.out.println("plz say sth to your dad: ");
        //正文 (让每个子类自己写)
        System.out.println(writeMain());
        //结尾
        System.out.println("thanks for reading");
    }

    public abstract String writeMain();
}
