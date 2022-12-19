package Thread;

/*掌握继承Thread类实现*/
public class ThreadDemo1{
    public static void main(String[] args) {
        Thread thread = new ThreadAPIsSub();
        //调用start方法启动线程
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程: " + i);
        }
    }
}
