package me.zhangjin.study.rabbit;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Created by ZhangJin on 2018/5/8.
 */

// 此注解用来指定一个或多个定义了 @Input 和 @Output 注解的接口，以此实现对消息通道（Channel）的绑定
// Sink 接口是 Spring Cloud Stream 中默认实现的对“输入消息通道绑定”的定义
@EnableBinding({Sink.class, SinkSender.class})
public class SinkReceiver {

    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    // 此注解将被修饰的方法注册为消息中间件上数据流的事件监听器
    // 注解中的属性值对应了监听的消息通道名
    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        // 在 RabbitMQ 的名为 "input" 的 Exchange 中发送消息
        // 同时会创建一个队列，这个队列会绑定到 input 交互器中
        // 队列是一个匿名的，特征为 exclusive=True,auto-delete=True
        logger.info("Received: " + payload);
    }

}
