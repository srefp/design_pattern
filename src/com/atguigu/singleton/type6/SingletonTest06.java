package com.atguigu.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        //测试
        System.out.println("双重检查");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); //true

        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton {
    private static volatile Singleton instance;

    private Singleton() {

    }

    //提供一个静态的共有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    //同时保证了效率，推荐使用
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
