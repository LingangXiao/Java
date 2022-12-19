package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarAgent {
    /*设计一个方法来返回一个明星对象的经纪人*/
    public static Skills getProxy(Star star) {
        //(ClassLoader loader,
        // Class<?>[] interfaces,
        //InvocationHandler h)
        return (Skills) Proxy.newProxyInstance(star.getClass().getClassLoader(),
                star.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("请付首款");
                        Object rs = method.invoke(star, args); //谁调用了什么方法
                        System.out.println("请付尾款");
                        return rs;
                    }
                });
    }
}
