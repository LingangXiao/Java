package JunitTest;

import org.junit.*;

public class TestJunitTestDemo1 {

    @Before
    public void berfore() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeclass");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }

    /*学习如何使用测试方法*/
    @Test
    public void testLoginName() {
        JunitTestDemo1 userService = new JunitTestDemo1();
        String rs = userService.loginName("admin", "123345");

        Assert.assertEquals("您的业务数据异常", "ok", rs);
    }

    @Test
    public void testSelectNames() {
        JunitTestDemo1 userService = new JunitTestDemo1();
        userService.selectNames();
    }
}
