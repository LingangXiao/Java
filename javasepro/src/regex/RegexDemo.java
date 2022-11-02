package regex;

public class RegexDemo {
    public static void main(String[] args) {
        //检查qq号码是否符合规矩
        //必须全部数字，并且在6-20位之间
        System.out.println(checkQQ("12345789"));
        System.out.println(checkQQ2("12345789"));
    }

    public static boolean checkQQ2(String qq) {
        return qq != null && qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ (String qq) {
        if (qq == null || qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        //判断是否全都是数字
        //12345a789
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if (ch <'0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}
