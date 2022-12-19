package reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class Test1 {
    @Test
    public void getConstructors(){
        //只能拿public
        Class c = Student.class;
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "--->" + constructor.getParameterCount());
        }
    }

    @Test
    public void getDeclaredConstructors(){
        //能拿全部的构造器
        Class c = Student.class;
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "--->" + constructor.getParameterCount());
        }
    }

    @Test
    public void getConstructor() throws Exception {
        //拿某一个构造器
        Class c = Student.class;
        Constructor cons= c.getConstructor();
        System.out.println(cons.getName() + "--->" + cons.getParameterCount());
    }

    @Test
    public void getDeclaredConstructor() throws Exception {
        //无权限随便拿
        Class c = Student.class;
        Constructor cons= c.getDeclaredConstructor();
        System.out.println(cons.getName() + "--->" + cons.getParameterCount());
        Constructor cons1= c.getDeclaredConstructor(String.class, int.class);
        System.out.println(cons1.getName() + "--->" + cons1.getParameterCount());
    }

    @Test
    public void getDeclaredConstructor1() throws Exception {
        //调用无参构造器得到一个类的对象的返回
        Class c = Student.class;
        Constructor cons= c.getDeclaredConstructor();
        System.out.println(cons.getName() + "--->" + cons.getParameterCount());
        Student s = (Student) cons.newInstance();
        System.out.println(s);

        //遇到私有的构造器可以暴力反射
        cons.setAccessible(true); // 可以强行把权限打开

        Constructor cons1= c.getDeclaredConstructor(String.class, int.class);
        System.out.println(cons1.getName() + "--->" + cons1.getParameterCount());

        Student s1 = (Student) cons1.newInstance("Sean",22);
        System.out.println(s1);
    }


}
