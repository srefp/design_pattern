package com.other.builder;

public interface ComputerBuilder {
    void buildCpu();
    void buildMemory();
    void buildDisk();
    Computer buildComputer();
}
