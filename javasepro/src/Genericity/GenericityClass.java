package Genericity;

public class GenericityClass {
    public static void main(String[] args) {
        /* 模拟arraylist定义一个Myarraylist，理解泛型类型*/
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Sean"); // 这里就只能添加字符串了,因为MyArrayList已经在<>里面写String了
        myArrayList.remove("123"); // 同理
    }
}
