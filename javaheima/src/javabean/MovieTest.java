package javabean;

public class MovieTest {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("长津湖", 9.7, "吴京");
        movies[1] = new Movie("我和我的父亲", 9.3, "吴京");
        movies[2] = new Movie("濮水少年", 7.8, "王川");
        //遍历数组中的每个对象，然后展示
        for (int i = 0; i < movies.length; i++) {
            Movie menu = movies[i];
            System.out.println("电影名: " + menu.getName());
            System.out.println("评分: " + menu.getRate());
            System.out.println("主演: " + menu.getActor());
            System.out.println("------------------------------");
        }
        

    }
}
