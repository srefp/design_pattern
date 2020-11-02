package com.other.adapter.objectadapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ObjectAdapter implements Targetable {
    private final static Log logger = LogFactory.getLog(ObjectAdapter.class);
    private Source source;

    public ObjectAdapter(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void editTextFile() {
        this.source.editTextFile();
    }

    @Override
    public void editWordFile() {
        logger.info("a word file editing");
    }
}
