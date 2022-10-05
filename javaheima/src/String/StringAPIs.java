package String;

public class StringAPIs {
    public static void main(String[] args) {
    //获取长度
    String name = "我爱你中国123";
        System.out.println(name.length());

    //获取某个索引处的字符
        System.out.println(name.charAt(1));

    //把字符串转换成字符数组
        System.out.println(name.toCharArray());

    //截取包前不包后
    String name2 = "java是最厉害的编程语言";
        System.out.println(name2.substring(0, 9));
        System.out.println(name2.substring(4, 9));


    //从当前索引一直截取到末尾
        System.out.println(name2.substring(4));

    //替换
        System.out.println(name2.replace("java", "python"));

    //判断文章中有没有包含关键字
        System.out.println(name2.contains("java")); //精准判断，如果是“jva”，虽然也包含了jva，但是一定要完全一样才会使true

    //判断是不是从某个地方开始的
        System.out.println(name2.startsWith("java"));
        System.out.println(name2.startsWith("最厉害"));

    //按照某个内容把字符串分割成字符串数组返回
    String name3 = "王宝强, 贾乃亮, 陈羽凡, 谢霆锋";
    String[] name4 = name3.split(",");
        for (int i = 0; i < name4.length; i++) {
            System.out.println("选择了 : " + name4[i]);
        }

    }
}
