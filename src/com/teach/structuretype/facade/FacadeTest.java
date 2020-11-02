package com.teach.structuretype.facade;

public class FacadeTest {
    public static void main(String[] args) {
        Starter starter = new Starter();
        starter.startup();
        System.out.println("-------------------------");
        starter.shutdown();
    }
}
