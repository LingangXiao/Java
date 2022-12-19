package reflect.framwork;

import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        /*提供一个通用框架，支持保存所有信息
        * */
        Student s = new Student();
        s.setName("Sean");
        s.setAge(13);
        s.setClassName("2820");
        s.setGender("M");
        s.setHobby("basketball");
        MyBatisUtil.save(s);
    }
}
