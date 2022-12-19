package Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo4 {
    @MyTest
    public void test1() {
        System.out.println("===test1===");
    }
    public void test2() {
        System.out.println("===test2===");
    }
    @MyTest
    public void test3() {
        System.out.println("===test3===");
    }
    public void test4() {
        System.out.println("===test4===");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        AnnotationDemo4 a4 = new AnnotationDemo4();
        //用main方法来启动
        //需要有注解的才能启动
        Class c = AnnotationDemo4.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)) {
                method.invoke(a4);
            }
        }
    }
}
