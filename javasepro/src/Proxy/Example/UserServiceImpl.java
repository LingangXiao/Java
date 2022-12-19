package Proxy.Example;

public class UserServiceImpl implements UserService {
    @Override
    public String login(String loginName, String password) {
        String rs = "登录名称和密码错误";
        if ("admin".equals(loginName) && "123456".equals(password)) {
            rs = "登录成功";
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }

    @Override
    public void deleteUsers() {
        System.out.println("您正在删除用户中");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String selectUsers() {
        String rs = "查询了1000个账户";
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }
}
