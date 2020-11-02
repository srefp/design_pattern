package com.other.singleton;

public class Lock2Singleton {
    private volatile static Lock2Singleton instance; //对象锁
    private Lock2Singleton(){}
    public static Lock2Singleton getInstance() {
        if (instance == null) {
            synchronized (Lock2Singleton.class) { //方法锁
                if (instance == null) {
                    instance = new Lock2Singleton();
                }
            }
        }
        return instance;
    }
}
