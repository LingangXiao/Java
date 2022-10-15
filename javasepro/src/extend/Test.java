package extend;

/*
* 继承设计规范
* 子类们的相同特征放在父类中定义
* 子类独有的属性和行为应该定义在子类自己里面
*
* */

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.run();
        //继承可以最大程度的增加代码的复用性
        //当有很多重复的代码时
        //或者增强类的功能扩展性
        //就可以用extend来简化代码
    }
}
