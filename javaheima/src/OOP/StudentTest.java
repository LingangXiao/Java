package OOP;

public class StudentTest {
    public static void main(String[] args) {
        Student Sean = new Student();
        Sean.name = "Sean";
        Sean.sex = 'M';
        Sean.hobby = "study";
        Sean.study();

        //把Sean变量赋值给一个学生类型的变量s2
        Student s2 = Sean;
        s2.hobby = "sleep"; //证明了这里是复制了地址，不是复制里面的值
        s2.study();


    }

}
