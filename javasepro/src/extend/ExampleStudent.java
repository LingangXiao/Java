package extend;

public class ExampleStudent extends ExamplePeople {
    /*独有的行为*/
    public void writeInfo() {
        System.out.println(getName() + "写下了学习语法");
    }
}
