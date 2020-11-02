package com.teach.buildtype.builder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BuilderDemo extends ComputerDirector {
    private final static Log logger = (Log) LogFactory.getLog(ComputerConcreteBuilder.class);
    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        ComputerBuilder computerBuilder = new ComputerConcreteBuilder();
        Computer computer = computerDirector.constructComputer(computerBuilder);
        logger.info(computer.getCpu());
        logger.info(computer.getDisk());
        logger.info(computer.getMemory());
    }
}
