package com.tektak.iloop.cellbin.cursor;

import com.tektak.iloop.aayo.util.CommonConst;
import com.tektak.iloop.util.common.BaseException;
import com.tektak.iloop.util.memcache.SpyCache;
import com.tektak.iloop.util.memcache.TektakMemCache;

/**
 * Created by Aashis Khanal on 9/17/15.
 */
public class CacheInit {
    private static TektakMemCache cache = null;
    public static TektakMemCache getCache() throws BaseException.MemCacheError {
       if(cache == null)
           cache = new TektakMemCache(new SpyCache(), CommonConst.CACHE_SERVER_LIST);
        return cache;
    }
}
