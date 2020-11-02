package com.other.adapter.classadapter;

public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.editTextFile();
        target.editWordFile();
    }
}
