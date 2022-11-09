package Nov3_Stream;

public class BestEmployee {
    private String name;
    private int salary;

    public BestEmployee(int i) {
    }

    public BestEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "BestEmployee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
