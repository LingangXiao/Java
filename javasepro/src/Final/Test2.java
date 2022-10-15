package Final;

public class Test2 {
    public static void main(String[] args) {
        //final变量只能被修饰一次
        final double score = 3.14;
//        score = 3.19; 因为是final，所以不能再赋值，可以用来保护数据

        final Teacher t1 = new Teacher("play game");
//    t1 = null; 不能修改了，因为已经赋值过一次了
        //但是可以用set方法改里面的内容，因为不能改的是地址
        System.out.println(t1.getHobby());
        t1.setHobby("study");
        System.out.println(t1.getHobby());
    }

    public static void buy(final double z) {
//        z = 0.1; 已经不能再赋值了，因为当我们调用buy的时候，需要输入一个z的值，那个已经是第一次的赋值了
    }

    public static final String schoolName = "heima";
    private final String name = "Sean";
    //以上两个就是实例和静态成员变量的final的例子，都是不能修改的




}

class Teacher {
    private String hobby;

    public Teacher(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}