package logger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Aashis Khanal on 9/7/15.
 */
public class Demo {

    public static void main(String[] args) {

        List<Bank> l = new LinkedList<Bank>();

        Bank b1 = new Bank("naseem1", "Darbhanga,bihar", 123, 1000);
        Bank b2 = new Bank("naseem2", "patna,bihar", 124, 1500);
        Bank b3 = new Bank("naseem3", "madhubani,bihar", 125, 1600);
        Bank b4 = new Bank("naseem4", "samastipur,bihar", 126, 1700);
        Bank b5 = new Bank("naseem5", "muzafferpur,bihar", 127, 1800);
        l.add(b1);
        l.add(b2);
        l.add(b3);
        l.add(b4);
        l.add(b5);
        Iterator<Bank> i = l.iterator();
    }
}
