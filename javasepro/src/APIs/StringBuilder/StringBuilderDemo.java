package APIs.StringBuilder;

/*学会使用StringBuilder来操作字符串 */

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("12");
        sb.append("4");
        sb.append(false);
        sb.append("a");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();
        sb1.append("a").append("b").append("c");
        System.out.println(sb1);

        //也可以反转内容
        sb1.reverse().append("110");
        System.out.println(sb1);

        //StringBuilder只是拼接字符的手段
        //最终结果还是要恢复成String类型,方便契合其他的方法
        StringBuilder sb2 = new StringBuilder();
        sb2.append("123456");
        String rs = sb2.toString();

    }
}
