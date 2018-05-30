package com.test.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author dangsl
 * @description
 * @date ${date} ${time}.
 * ${tags}.
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {
    @RabbitHandler
    public void process(String param) {
        System.out.println("Receiver  : " + param);
    }
}
