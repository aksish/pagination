package com.tektak.iloop.cellbin.cursor;

import org.apache.thrift.TBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Aashis Khanal on 9/17/15.
 */
public class Fetch<T>{
    private String cursor;
    private int pageSize = 10;
    private boolean hasNextPage = true;
    private int ttl = 30;
    private boolean drillUp;
    private boolean drillDown;
    private int drillLimit;
    private List<T> list = new ArrayList<>(0);
    private int offset = 0;
    private String checkpoint;
    private boolean cacheExpired;

    public Fetch(){}

    public Fetch(String cursor, int pageSize){
        this.cursor = cursor;
        this.pageSize = pageSize;
    }

    public boolean isCacheExpired() {
        return cacheExpired;
    }

    public void setCacheExpired(boolean cacheExpired) {
        this.cacheExpired = cacheExpired;
    }

    public String getCheckpoint() {
        return checkpoint;
    }

    public int getDrillLimit() {
        return drillLimit;
    }

    public void setDrillLimit(int drillLimit) {
        this.drillLimit = drillLimit;
    }

    public void setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isDrillUp() {
        return drillUp;
    }
    public void setDrillUp(boolean drillUp) {
        this.drillUp = drillUp;
    }
    public boolean isDrillDown() {
        return drillDown;
    }
    public void setDrillDown(boolean drillDown) {
        this.drillDown = drillDown;
    }
    public int getTtl() {
        return ttl;
    }
    public void setTtl(int ttl) {
        this.ttl = ttl;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }
    public boolean isHasNextPage() {
        return hasNextPage;
    }
    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public void setList(List<T> list){
        this.list = list;
    }
    public List<T> getList(){
        return this.list;
    }

    public  List<T> fetch(){
        return this.list;
    }


    public void drill(Comparator<T> comparator){
        if(comparator!=null){
            if(list!=null){
                Collections.sort(list, comparator);
            }
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Fetch ==> (");
        sb.append("Cursor: " + cursor + "| ");
        sb.append("PageSize: " + pageSize + "| ");
        sb.append("HasNextPage: " + hasNextPage + "| ");
        sb.append("DrillUp: " + drillUp + "| ");
        sb.append("DrillDown: " + drillDown + "| ");
        sb.append("DrillLimit: " + drillLimit + "| ");
        sb.append("List: " + list + "| ");
        sb.append("Checkpoint: " + checkpoint + "| ");
        sb.append("CacheExpired: " + cacheExpired + "| ");
        sb.append(")");
        return sb.toString();
    }
}
