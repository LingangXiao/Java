package encapsulation;

public class Student {
    /*
    * 面向对象的三大特征，封装，继承，多态
    * 原则：对象代表什么，就得封装对应的数据，并提供数据对应的行为
    * 比如人画一个圆
    * 有两个class，人和圆，但我们要输入圆的信息，比如半径周长等，都要封装进圆的class
    * 人没有画圆，圆是通过自己的半径把自己画出来的
    * 人只是调用了画圆的方法
    */

    //private的修饰只能在当前的class中使用，不能在其他class中直接被调用
    //这时我们就需要用和private配套的pulic的setter和getter来暴露其取值和赋值

    int age;

    private int age1;
    //要提供成套的getter和setter
    public void setAge1(int age1) {
        if (age1 >= 0 && age1 <= 200) {
            this.age1 = age1;
        }
        else {
            System.out.println("invalid age");
        }
    }

    public int getAge1() {
        return age1;
    }
}
