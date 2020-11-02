package com.teach.structuretype.bridge;

public class DriverManagerBridge {
    private Driver driver;

    public void execute() {
        this.driver.executeSQL();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
