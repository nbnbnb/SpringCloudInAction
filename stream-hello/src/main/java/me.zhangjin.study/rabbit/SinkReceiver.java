package me.zhangjin.study.rabbit;


import me.zhangjin.study.StreamHelloApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Created by ZhangJin on 2018/5/8.
 */

@EnableBinding(Sink.class)
public class SinkReceiver {

    private static Logger logger = LoggerFactory.getLogger(StreamHelloApplication.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        // 在 RabbitMQ 的名为 "input" 的 Exchange 中发送消息
        logger.info("Received: " + payload);
    }

}
