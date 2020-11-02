package com.atguigu.facade;

public class Client {
    public static void main(String[] args) {
        //这里直接调用很麻烦
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.end();
    }
}
