package Nov8_logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    //创建日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {
        try {
            LOGGER.debug("main start");
            LOGGER.info("second line");
            int a = 10;
            int b = 0;
            LOGGER.trace("a = " + a);
            LOGGER.trace("b = " + b);
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("error" + e);
        }
    }
}
