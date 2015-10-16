package com.tektak.iloop.cellbin.cursor;

import com.tektak.iloop.aayo.util.Idd;
import com.tektak.iloop.kauwa.aayo.Wrapper;
import com.tektak.iloop.kauwa.serializer.Serializer;
import com.tektak.iloop.util.common.BaseException;
import com.tektak.iloop.util.memcache.TektakMemCache;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Aashis Khanal on 9/17/15.
 */
public abstract class Cache implements ICache{

    protected List list = null;
    protected Paginate paginate = null;
    protected TektakMemCache cache = null;
    public static final String OFFSET = "offset";

    @Override
    public String cache(Wrapper wrapper, int ttl) throws BaseException.MemCacheError, Serializer.SerializerException {
        String cursor = Idd.getId();
        boolean isCached = cache.set(cursor, Serializer.serialize(wrapper));
        if(isCached){
            cache.set(cursor+OFFSET, ByteBuffer.allocate(4).putInt(0).array(), ttl);
            return cursor;
        }
        return "";
    }

    @Override
    public Wrapper deCache(Fetch fetch) throws BaseException.MemCacheError, Serializer.SerializerException {
        Wrapper wrapper = new Wrapper();

        if(fetch==null)
            return wrapper;
        byte[] buffer = (byte[])cache.get(fetch.getCursor());
        if(buffer!=null){
            byte[] offset = (byte[])cache.get(fetch.getCursor()+OFFSET);
            if(offset!=null){
                Serializer.deserialize(buffer, wrapper);
                wrapper.setOffset(byteArrayToInt(offset));
            }
        }
        return wrapper;
    }

    private int byteArrayToInt(byte[] b)
    {
        return   b[3] & 0xFF |
                (b[2] & 0xFF) << 8 |
                (b[1] & 0xFF) << 16 |
                (b[0] & 0xFF) << 24;
    }

}
