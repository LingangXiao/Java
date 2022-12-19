package reflect.field;

import org.junit.Test;

import java.lang.reflect.Field;

public class FieldDemo1 {
    @Test
    public void getDeclaredFields() {
        Class c = Student.class;

        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName() + "--->" + field.getType());
        }
    }

    //获取某个成员的变量对象
    @Test
    public void getDeclaredField() throws NoSuchFieldException {
        Class c = Student.class;
        Field field = c.getDeclaredField("schoolName");
        System.out.println(field.getName() + "-->" + field.getType());
    }


    @Test
    public void setField() throws NoSuchFieldException, IllegalAccessException {
        Class c = Student.class;
        Field field1 = c.getDeclaredField("name");
        field1.setAccessible(true);
        Student s = new Student();
        //赋值
        field1.set(s, "Sean");
        System.out.println(s);
        //取值
        String name = (String) field1.get(s);
        System.out.println(name);
    }
}
