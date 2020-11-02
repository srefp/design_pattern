package com.teach.structuretype.proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HR implements Company {
    private final static Log logger = LogFactory.getLog(HR.class);
    @Override
    public void findWorker(String title) {
        logger.info("I need to find a worker, the title is: " + title);
    }
}
