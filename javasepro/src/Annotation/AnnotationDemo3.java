package Annotation;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationDemo3 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class c = BookStroe.class;
        Method m = c.getDeclaredMethod("test");

        if(c.isAnnotationPresent(Book.class)) {
            Book book = (Book) m.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }
    }
}

@Book(value = "三体", price = 99.9, authors = {"idk"})
class BookStroe{
    @Book(value = "sjjs", price = 999.9, authors = {"hj"})
    public void test() {

    }
}
