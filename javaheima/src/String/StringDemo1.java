package String;

public class StringDemo1 {
    public static void main(String[] args) {
        String name = "Xiao";
        name += "ling";
        name += "ang";
        System.out.println(name);

        //其他的方法 (不常用)
        String s1 = new String();
        String s2 = new String("Xiaolingang");

        //常用方法
        char[] chars = {'x', 'i', 'a', 'o'};
        String s3 = new String(chars);
        System.out.println(s3); //会自动遍历所有的元素，并且连起来

        byte[] bytes = {97, 98, 99, 65};
        String s4 = new String(bytes);
        System.out.println(s4); //作为ascii的地址来转换成字母
    }
}
