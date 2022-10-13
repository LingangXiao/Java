package StaticDemo;

public class StaticDemo {
    public static void main(String[] args) {
        //learn about static
        /*
        static是静态的意思，可以修饰成员变量和成员方法
        static修饰成员变量百事该成员变量只在内存中储存一份，可以被共享访问和修改
         */
        System.out.println(User.onlineNumber);
        /*System.out.println(User.age);  不能用类名来访问了*/
        User u = new User();
        u.age = 34;
        System.out.println(u.age);
        //比如设计一个游戏，同时的在线人数就要加static，因为一个游戏只会有一个同时在线的人数
        //而用户的姓名或者其他信息就不能加static，因为一个游戏里每个人都不一样
    }
}