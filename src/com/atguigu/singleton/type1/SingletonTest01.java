package com.atguigu.singleton.type1;

public class SingletonTest01 {
    public static void main(String[] args) {
        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); //true

        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

//饿汉式（静态变量）
class Singleton {
    //1. 构造器私有化，外部不能new
    private Singleton() {

    }

    //2. 本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3. 对外提供一个共有的静态方法，返回对象实例
    public static Singleton getInstance() {
        return instance;
    }
}