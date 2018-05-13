package me.zhangjin.study.rabbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * Created by ZhangJin on 2018/5/13.
 */

@EnableBinding(value = SinkInput.class)
public class SinkReceiver {

    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    /*

    @ServiceActivator(inputChannel = SinkInput.INPUT)
    public void receive(Object payload) {
        logger.info("Received: " + payload);
    }


    @Transformer(inputChannel = SinkInput.INPUT, outputChannel = SinkInput.INPUT)
    public User transform(String message) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(message, User.class);
    }
    */

    @StreamListener(SinkInput.INPUT)
    public void receive(User user) {
        logger.info("Received: " + user);
    }
}
