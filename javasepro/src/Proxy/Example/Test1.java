package Proxy.Example;

public class Test1 {
    public static void main(String[] args) {
        UserService userService = ProxyUtil.getProxy(new UserServiceImpl());
        System.out.println(userService.login("admin", "123456"));
        userService.deleteUsers();
        System.out.println(userService.selectUsers());
    }
}
