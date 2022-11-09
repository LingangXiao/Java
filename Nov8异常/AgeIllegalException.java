package Nov8异常;

public class AgeIllegalException extends Exception{
    //自定义的编译时异常


    public AgeIllegalException(String message) {
        super(message);
    }
}
