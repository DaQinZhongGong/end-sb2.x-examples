package com.daqinzhonggong.rabbit.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "daqinzhonggong")
public class NeoReceiver2 {

    @RabbitHandler
    public void process(String neo) {
        System.out.println("Receiver 2: " + neo);
    }

}
