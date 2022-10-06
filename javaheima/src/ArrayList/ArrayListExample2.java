package ArrayList;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        //某影院需要存储三部电影，然后依次展示出来
        Movie m1 = new Movie("star war 1", 9.0, "laowai");
        Movie m2 = new Movie("star war 2", 9.1, "laowai");
        Movie m3 = new Movie("star war 3", 9.2, "laowai");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        /*System.out.println(movies);*/

        for (int i = 0; i < movies.size(); i++) {
            Movie output = movies.get(i);
            System.out.println(output.getName());
            System.out.println(output.getScore());
            System.out.println(output.getActor());
            System.out.println("-------------------");
        }

    }
}
