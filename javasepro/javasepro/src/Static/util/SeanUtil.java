package Static.util;

import java.util.Random;

/*工具类
* 可以在这里创造很多方法
* 然后有需要的时候，再直接调用
* 这样可以做到一个方法多次调用，不需要每次出现都重新写
* 比如验证码的弹窗
* 修改密码，登录，或者验证的时候都可能需要使用验证码功能
* 不可能每个方法都写一次，也很不美观
* 可以把方法写到一个工具类 （一定要是静态的方法，就是有static的）
* 每次使用的时候直接从里面调用*/
public class SeanUtil {
    /*静态方法*/
    private SeanUtil() {
        //建议给每个静态方法都私有化，因为工具类不需要创建对象
    }
    public static String createVerifyCode(int n) {
        String code = ""; //定义一个变量用来记验证码
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //定义一个随机生成的索引
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            //获取随机索引对应的字符，再连接给code
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }
}
