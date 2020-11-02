package com.atguigu.proxy.cglib;

public class TeacherDao {
    public void teach() {
        System.out.println("老师授课中，我是CGLib代理，不需要实现接口");
    }
}
