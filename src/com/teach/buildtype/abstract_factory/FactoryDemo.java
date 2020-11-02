package com.teach.buildtype.abstract_factory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FactoryDemo {
    private final static Log logger = LogFactory.getLog(FactoryDemo.class);
    public static void main(String[] args) {
        AbstractFactory phoneFactory = new PhoneFactory();
        Phone phoneHuaWei = phoneFactory.createPhone("HuaWei");
        Phone phoneApple = phoneFactory.createPhone("Apple");

        logger.info(phoneHuaWei.call());
        logger.info(phoneApple.call());

        AbstractFactory computerFactory = new ComputerFactory();
        Computer computerHuaWei = computerFactory.createComputer("HuaWei");
        Computer computerApple = computerFactory.createComputer("Apple");

        logger.info(computerHuaWei.internet());
        logger.info(computerApple.internet());
    }
}
