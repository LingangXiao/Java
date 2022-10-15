package extend;

public class ExampleTest {
    public static void main(String[] args) {
        //理解继承设计
        ExampleStudent s = new ExampleStudent();
        s.setName("Sean");
        s.setAge(34);
        System.out.println(s.getName());
        s.queryCourse(); //父类
        s.writeInfo(); //子类
    }
}
