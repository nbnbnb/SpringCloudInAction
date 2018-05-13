package me.zhangjin.study.rabbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

/**
 * Created by ZhangJin on 2018/5/13.
 */

@EnableBinding(value = {SinkInput.class, SinkReceiverFeedback.class})
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
    @SendTo(SinkReceiverFeedback.FEEDBACK)
    public Object receiveFromInput(User user) {
        logger.info("Consumer: " + user);
        return "{ Consumer Feedback {" + user + "} }";
    }

}
