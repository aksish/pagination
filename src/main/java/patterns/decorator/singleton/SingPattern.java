package patterns.decorator.singleton;

/**
 * Created by Aashis Khanal on 8/18/15.
 */
public class SingPattern {
private static  SingPattern pattern = new SingPattern();
    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg = "hellow";
    private SingPattern(){
    }
    public static SingPattern getPattern(){
      return new SingPattern();
    }
    public String  getMsg(){
        return msg;
    }

    public static void main(String[] args) {
        SingPattern.getPattern().setMsg("Hello");
        System.out.println(SingPattern.getPattern().getMsg());
    }

}
