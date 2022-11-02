package InnerClass.anonymous;

public class Test2 {
    /*掌握匿名内部类的使用形式*/
    public static void main(String[] args) {
        Swimming s = new Swimming() {

            @Override
            public void Swim() {
                System.out.println("student swim good");
            }
        };
        go(s);
        System.out.println("---------------------");

        /*或者直接把new Swimming后面的全部放进go（）里面，因为代表的东西是一个
        * 具体操作如下*/

        go(new Swimming() {
            @Override
            public void Swim() {
                System.out.println("teacher swim not good");
            }
        });

    }
    /*学生老师运动员一起参加游泳比赛*/
    public static void go(Swimming s) {
        System.out.println("start");
        s.Swim();
        System.out.println("end");
    }
}

/*class Student implements Swimming {

    @Override
    public void Swim() {
        System.out.println("student swim good");
    }
}*/



interface Swimming {
    void Swim();
}
