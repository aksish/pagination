package exception;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Created by Aashis Khanal on 8/6/15.
 */
public class Mum1{
    public List<Object> getResult() {
        return result;
    }

    public void setResult(List<Object> result) {
        this.result = result;
    }

    private List<Object> result;
    public void removeDuplicates(List<Object> list){
       result = new ArrayList<Object>();
        result.add(list.get(0));
        list = list.subList(1,list.size());
        Iterator iterator = list.iterator();
        for(Object o: list){
            while (iterator.hasNext()){
                if(!o.equals(iterator.next())){
                    result.add(o);
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        List<Object> qsn = new ArrayList<Object>(){{
            add("good");
            add("bad");
            add("best");
            add("normal");
            add("bad");
            add("bad");
        }};

        Mum1 mum = new Mum1();
        mum.removeDuplicates(qsn);
       System.out.println(mum.getResult().toString());


    }

}
