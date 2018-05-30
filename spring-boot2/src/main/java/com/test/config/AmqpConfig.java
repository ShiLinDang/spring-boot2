package com.test.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dangsl
 * @description
 * @date ${date} ${time}.
 * ${tags}.
 */
@Configuration
public class AmqpConfig {

    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }
}
