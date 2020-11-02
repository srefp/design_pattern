package com.other.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        DriverManagerBridge driverManagerBridge = new MyDriverBridge();
        //设置MySQL驱动
        driverManagerBridge.setDriver(new MysqlDriver());
        driverManagerBridge.execute();
        //切换到Oracle驱动
        driverManagerBridge.setDriver(new OracleDriver());
        driverManagerBridge.execute();
    }
}
