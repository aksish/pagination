package com.tektak.iloop.cellbin.cursor;

import com.tektak.iloop.kauwa.aayo.Wrapper;
import com.tektak.iloop.kauwa.serializer.Serializer;
import com.tektak.iloop.util.common.BaseException;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Aashis Khanal on 9/16/15.
 */
public interface ICache{
    public String cache(Wrapper fetch, int ttl) throws BaseException.MemCacheError, Serializer.SerializerException;
    public Wrapper deCache(Fetch fetch) throws BaseException.MemCacheError, Serializer.SerializerException;
    public String cacheObjects(Fetch fetch) throws Serializer.SerializerException, BaseException.MemCacheError;
    public Fetch getCache(Fetch fetch) throws BaseException.MemCacheError, Serializer.SerializerException;
    public Fetch recoverCache(Fetch fetch) throws Serializer.SerializerException, BaseException.MemCacheError;
}
