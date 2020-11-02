package com.other.builder;

public class ComputerDirector {
    public Computer constructComputer(ComputerBuilder computerBuilder) {
        computerBuilder.buildMemory();
        computerBuilder.buildCpu();
        computerBuilder.buildDisk();
        return computerBuilder.buildComputer();
    }
}
