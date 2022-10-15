package extend.thisDemo;

public class Student {
    private String name;
    private String schoolName;

    public Student() {
    }

    /*如果学生不填写学校，就默认对象的学校是黑马*/
    public Student (String name) {
        this(name, "黑马");
    }

    public Student(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
