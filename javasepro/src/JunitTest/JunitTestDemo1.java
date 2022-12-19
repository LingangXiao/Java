package JunitTest;

public class JunitTestDemo1 {
    public String loginName(String loginName, String passWord) {
        if ("admin".equals(loginName) && "123345".equals(passWord)) {
            return "ok";
        }
        else {
            return "not ok";
        }
    }

    public void selectNames() {
        //System.out.println(10/0);
        System.out.println("all ok ");
    }
}
