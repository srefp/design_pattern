package com.teach.buildtype.prototype;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PrototypeTest {
    private final static Log logger = LogFactory.getLog(PrototypeTest.class);

    public static void main(String[] args) {
        //浅复制
        Computer computer = new Computer("8core", "16G", "1TB");
        logger.info("before simple clone: " + computer.toString());
        Computer computerClone = (Computer) computer.clone();
        logger.info("after simple clone: " + computerClone.toString());

        //深复制
        Disk disk = new Disk("476G", "2TB");
        ComputerDetail computerDetail = new ComputerDetail("12core", "64G", disk);
        logger.info("before deep clone: " + computerDetail.toString());
        ComputerDetail computerDetailClone = (ComputerDetail) computerDetail.clone();
        logger.info("after deep clone: " + computerDetailClone.toString());
    }
}
