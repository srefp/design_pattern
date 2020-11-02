package com.teach.buildtype.prototype;

//应用对象深复制
public class Disk implements Cloneable {
    private String ssd;
    private String hhd;

    public Disk(String ssd, String hhd) {
        this.ssd = ssd;
        this.hhd = hhd;
    }
    public Object clone() {
        try {
            return (Disk) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
