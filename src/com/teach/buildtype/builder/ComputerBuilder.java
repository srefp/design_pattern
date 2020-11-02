package com.teach.buildtype.builder;

public interface ComputerBuilder {
    void buildCpu();
    void buildMemory();
    void buildDisk();
    Computer buildComputer();
}
