package me.zhangjin.study.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ZhangJin on 2018/5/7.
 */

@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

}
