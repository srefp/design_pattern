package com.teach.structuretype.flyweight;

import com.alibaba.fastjson.JSON;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MemoryFactory {
    private final static Log logger = LogFactory.getLog(MemoryFactory.class);

    //内存对象列表
    private static List<Memory> memoryList = new ArrayList<>();

    public static Memory getMemory(int size) {
        Memory memory = null;
        for (int i = 0; i < memoryList.size(); i++) {
            memory = memoryList.get(i);
            //如果存在和需求size一样大小并且未使用的内存块，则直接返回
            if (memory.getSize() == size && memory.isUsed() == false) {
                memory.setUsed(true);
                memoryList.set(i, memory);
                logger.info("get memory from memoryList: " + JSON.toJSONString(memory));
                break;
            }
        }
        //如果内存不存在，则从系统中申请新的内存返回，并将该内存放入内存对象列表中
        if (memory == null) {
            memory = new Memory(32, false, UUID.randomUUID().toString());
            logger.info("create a new memory form system and add to memoryList: " + JSON.toJSONString(memory));
            memoryList.add(memory);
        }
        return memory;
    }

    //释放内存
    public static void releaseMemory(String id) {
        for (int i = 0; i < memoryList.size(); i++) {
            Memory memory = memoryList.get(i);
            //如果存在和需求size一样大小并且未使用的内存块，则直接返回
            if (memory.getId().equals(id)) {
                memory.setUsed(false);
                memoryList.set(i, memory);
                logger.info("release memory: " + id);
                break;
            }
        }
    }
}
