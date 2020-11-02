package com.other.bridge;

public class MyDriverBridge extends DriverManagerBridge {
    public void execute() {
        getDriver().executeSQL();
    }
}
