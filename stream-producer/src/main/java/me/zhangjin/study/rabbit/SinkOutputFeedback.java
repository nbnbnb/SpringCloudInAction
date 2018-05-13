package me.zhangjin.study.rabbit;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by ZhangJin on 2018/5/14.
 */

// 监听服务端反馈消息的那个信道
public interface SinkOutputFeedback {
    String FEEDBACK = "myQueueFeedback";

    @Input(SinkOutputFeedback.FEEDBACK)
    SubscribableChannel feedbackInput();
}
