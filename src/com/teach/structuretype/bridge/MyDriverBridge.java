package com.teach.structuretype.bridge;

public class MyDriverBridge extends DriverManagerBridge {
    public void execute() {
        getDriver().executeSQL();
    }
}
