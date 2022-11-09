package Nov8异常;

public class DIYError {
    /*自定义异常
    * 比如18岁以上才可以使用
    * 只有男生可以使用
    * */
    public static void main(String[] args) throws AgeIllegalException {
        //用户年龄限制在0-200岁
        try {
            checkAge(-34);
        } catch (AgeIllegalException e) {
            throw new RuntimeException(e);
        }
    }

    public static void checkAge (int age) throws AgeIllegalException {
        if (age < 0 || age > 200) {
            //System.out.println("not a valid age");
            //这里就可以抛出异常
            throw new AgeIllegalException(age + " is not a valid age");
        }
        else {
            System.out.println("ok");
        }
    }
}
