package me.zhangjin.study.rabbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import java.util.Date;

/**
 * Created by ZhangJin on 2018/5/13.
 */

@EnableBinding(value = SinkOutput.class)
public class SinkSender {

    private static Logger logger = LoggerFactory.getLogger(SinkSender.class);

    // 每隔一段时间，发送消息到指定的队列
    // 这个注解将会获得自动注入的 MessageChannel，通过他来发送消息

    /*
    @Bean
    @InboundChannelAdapter(value = SinkOutput.OUTPUT, poller = @Poller(fixedDelay = "2000"))
    public MessageSource<Date> timerMessageSource() {
        return () -> {
            System.out.println("Starting Send data.");
            return new GenericMessage<>(new Date());
        };
    }

    @Transformer(inputChannel = SinkOutput.OUTPUT, outputChannel = SinkOutput.OUTPUT)
    public Object transform(Date message) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(message);
    }
    */

    @Bean
    @InboundChannelAdapter(value = SinkOutput.OUTPUT, poller = @Poller(fixedDelay = "2000"))
    public MessageSource<String> timerMessageSource() {
        return () -> {
            System.out.println("Starting Send data." + new Date().getTime());
            return new GenericMessage<>("{\"name\":\"ZhangJin\", \"age\":30}");   // 中文乱码？？？
        };
    }

}
