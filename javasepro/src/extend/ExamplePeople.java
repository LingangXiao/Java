package extend;

public class ExamplePeople {
    private String name;
    private int age;

    /*
    * 查看课表的功能*/
    public void queryCourse() {
        System.out.println(name + "在查看课表");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
