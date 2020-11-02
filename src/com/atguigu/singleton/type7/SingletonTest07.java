package com.atguigu.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        //测试
        System.out.println("使用静态内部类完成单例模式");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); //true

        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

// 静态内部类完成，推荐使用
class Singleton {
    private static volatile Singleton instance;

    //构造器私有化
    private Singleton() {

    }

    //写一个静态内部类，该类有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }


    //提供一个静态的共有方法，之间返回SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
