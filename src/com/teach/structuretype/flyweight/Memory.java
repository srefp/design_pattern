package com.teach.structuretype.flyweight;

public class Memory {
    private int size; //内存大小
    private boolean used; //内存是否在被使用
    private String id; //内存id

    public Memory(int size, boolean used, String id) {
        this.size = size;
        this.used = used;
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
