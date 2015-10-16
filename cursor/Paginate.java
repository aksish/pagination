package com.tektak.iloop.cellbin.cursor;

import com.tektak.iloop.util.common.BaseException;
import com.tektak.iloop.util.memcache.TektakMemCache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Aashis Khanal on 9/18/15.
 */
public class Paginate <T>{
    private int pageSize = 10;
    private List<T> list;
    private int offset = 0;

    public Fetch<T> getPage(Fetch<T> fetch){
        if(fetch!=null){
            _init(fetch);
            if(list!=null){
                if(list.size()>0){
                    if(offset>=list.size()){
                        fetch.setList(new ArrayList<T>(0));
                        fetch.setHasNextPage(false);
                    }
                    else {
                        if(pageSize<list.size()){
                            if(offset+pageSize<list.size()){
                                fetch.setList(list.subList(offset, offset+pageSize));
                                fetch.setHasNextPage(true);
                            }
                            else{
                                fetch.setList(list.subList(offset, list.size()));
                                fetch.setHasNextPage(false);
                            }
                        }
                    }
                }
                else {
                    fetch.setHasNextPage(false);
                }
            }
            else {
                fetch.setHasNextPage(false);
            }
        }
        return fetch;
    }

    private void _init(Fetch<T> fetch){
        pageSize = fetch.getPageSize();
        list = fetch.getList();
        offset = fetch.getOffset();
    }
}
