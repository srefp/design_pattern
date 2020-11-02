package com.teach.buildtype.builder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ComputerConcreteBuilder implements ComputerBuilder {
    Computer computer;
    private final static Log logger = (Log) LogFactory.getLog(ComputerConcreteBuilder.class);

    public ComputerConcreteBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCpu() {
        logger.info("build cpu...");
        computer.setCpu("8 cores");
    }

    @Override
    public void buildMemory() {
        logger.info("build memory...");
        computer.setMemory("16G");
    }

    @Override
    public void buildDisk() {
        logger.info("build disk...");
        computer.setDisk("1T");
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }

}
