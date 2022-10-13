package Static.util;

public class Login {
    public static void main(String[] args) {
        /*String code = ""; //定义一个变量用来记验证码
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //定义一个随机生成的索引
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            //获取随机索引对应的字符，再连接给code
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        System.out.println("验证码：" + code);*/
        System.out.println(SeanUtil.createVerifyCode(8));
    }
}
