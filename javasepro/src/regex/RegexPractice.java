package regex;

public class RegexPractice {
    public static void main(String[] args) {
        /*校验密码
        * 必须是数字 字母 下划线 且至少六位*/
        System.out.println("2442fsfsf".matches("\\w{6,}"));

        /*验证码
        * 必须是数字和字符 必须是4位*/
        System.out.println("34rs".matches("[a-zA-Z0-9]{4}"));
    }
}
