package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        /*正则表达式在方法中的应用*/
        String names = "肖恩askjdfh234是sldkfj234爸爸sldkfj234";
        String[] arr = names.split("\\w+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String names2 = names.replaceAll("\\w", "3");
        System.out.println(names2);

        /*拓展，爬取信息
        * 死代码，可以硬记*/
        String rs = "电话号码18500873689，邮箱号是xiaolingang@outlook.com;sldkfjg";
        String regex = "\\w{1,30}@[a-z0-9]{2,20}(\\.[a-z0-9]{2,20}){1,2}|1[3-9]\\d{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rs);
        while (matcher.find()) {
            String rs1 = matcher.group();
            System.out.println(rs1);
        }
    }
}
