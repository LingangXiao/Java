package reflect.method;

import org.junit.Test;

import java.lang.reflect.Method;

public class MethodDemo {
    @Test
    public void getDeclaredMethods() {
        Class c = Dog.class;

        Method[] methods = c.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName() + method.getReturnType() + method.getParameterTypes());
        }
    }
}
