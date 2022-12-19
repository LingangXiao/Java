package reflect;

/*获取class对象*/
public class Test {
    public static void main(String[] args) throws Exception {
        //1 class类中的一个静态方法：forName
        Class c = Class.forName("reflect.Student");
        System.out.println(c);

        //2 类名class
        Class c1 = Student.class;
        System.out.println(c1);

        //3 对象.getClass（）获取对象对应类的class
        Student s = new Student();
        Class c2 = s.getClass();
        System.out.println(c2);
    }
}
