package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionObject {
    /*定义一个电影类
    * 定义一个集合用来储存3部电影*/
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("三体1", 9.0, "idk"));
        movies.add(new Movie("三体2", 9.1, "idk1"));
        movies.add(new Movie("三体3", 9.2, "idk2"));
        for (Movie movie : movies) {
            System.out.println("片名： " + movie.getName());
            System.out.println("评分： " + movie.getScore());
            System.out.println("主演： " + movie.getActor());
        }
    }
}
