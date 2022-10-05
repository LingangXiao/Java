package javabean;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("Sean");
        u1.setHeight(180.0);
        u1.setSalary(20000);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());

        User u2 = new User("Xiao", 190, 10000);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());
    }
}
