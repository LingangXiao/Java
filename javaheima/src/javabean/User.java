package javabean;

public class User {
    //javabean也成为实体类
    //其对象可用于程序中封装数据
    //比如网站的用户注册，每个注册用户的信息都会被单独的封装起来

    private String name;
    private double height;
    private double salary;
    //我们必须为成员变量提供成套的setter和getter


    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
