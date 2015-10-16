package patterns.decorator.singleton;

/**
 * Created by Aashis Khanal on 8/19/15.
 */
public class Plant implements Living{
    String name = "lotus";

    public void printName() {
        System.out.println(name);
    }
}
