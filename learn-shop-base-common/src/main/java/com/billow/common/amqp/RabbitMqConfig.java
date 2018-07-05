package com.billow.common.amqp;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuyongtao
 * @create 2018-06-26 16:02
 */
@Configuration
public class RabbitMqConfig {

    @Value("${config.mq.orderToUser.orderStatus}")
    private String orderStatusQueue;
    @Value("${config.mq.tx.SysEventPublish}")
    private String sysEventPublishQueue;
    @Value("${config.mq.tx.SysEventProcess}")
    private String sysEventProcessQueue;
    @Value("${config.mq.ts.test}")
    private String testQueue;

    @Bean
    public Queue getOrderStatusQueue() {
        return new Queue(orderStatusQueue);
    }

    @Bean
    public Queue getSysEventPublishQueue() {
        return new Queue(sysEventPublishQueue);
    }

    @Bean
    public Queue getSysEventProcessQueue() {
        return new Queue(sysEventProcessQueue);
    }

    @Bean
    public Queue getTestQueue() {
        return new Queue(testQueue);
    }
}