package com.teach.structuretype.adapter.objectadapter;

public class AdapterTest {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new ObjectAdapter(source);
        target.editWordFile();
        target.editTextFile();
    }
}
