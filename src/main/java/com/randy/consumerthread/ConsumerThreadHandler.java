package com.randy.consumerthread;

import org.apache.kafka.clients.consumer.ConsumerRecord;

/**
 * Author  : RandySun (sunfeng152157@sina.com)
 * Date    : 2017-08-20  16:29
 * Comment :
 */
public class ConsumerThreadHandler implements Runnable {
    private ConsumerRecord consumerRecord;

    public ConsumerThreadHandler(ConsumerRecord consumerRecord){
        this.consumerRecord = consumerRecord;
    }

    @Override
    public void run() {
        System.out.println("Consumer Message:"+consumerRecord.value()+",Partition:"+consumerRecord.partition()+"Offset:"+consumerRecord.offset());
    }
}
