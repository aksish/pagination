package patterns.decorator.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aashis Khanal on 8/19/15.
 */
public class General <T extends Living>{
    public T getT() {
        return t;
    }


    public void setT(T t) {
        this.t = t;
    }

    public void printMe(){
        t.printName();
    }

    private T t;

    public static void main(String[] args) {
        General<Person> p = new General<Person>();
        p.setT(new Person());
        p.printMe();
        List<?> list =  new ArrayList<Object>();

        General<Plant> plant = new General<Plant>();
        plant.setT(new Plant());
        plant.printMe();


    }
}
