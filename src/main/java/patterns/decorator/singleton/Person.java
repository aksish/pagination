package patterns.decorator.singleton;

/**
 * Created by Aashis Khanal on 8/19/15.
 */
public class Person implements Living{
    private String name = "Aashis";

    public void printName() {
        System.out.println(name);
    }
}
