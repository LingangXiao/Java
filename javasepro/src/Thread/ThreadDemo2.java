package Thread;

/*学会线程的第二种方式*/
public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程： " + i);
            }
        };

        Thread t = new Thread(runnable);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程： " + i);
        }
    }
}
