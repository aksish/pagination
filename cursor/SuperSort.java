package com.tektak.iloop.cellbin.cursor;

import com.tinkerpop.gremlin.Tokens;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Aashis Khanal on 9/16/15.
 */
public class SuperSort<T> {

    protected Comparator comparator;

    public Comparator getComparator() {return comparator;}

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }
    public void sort(List<T> toSort, Comparator comparator) {
        if(comparator!=null)
            this.comparator = comparator;
        if(toSort!=null && toSort.size() > 0)
            Collections.sort(toSort, comparator);
    }

}
