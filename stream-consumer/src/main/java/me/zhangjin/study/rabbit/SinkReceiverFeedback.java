package me.zhangjin.study.rabbit;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by ZhangJin on 2018/5/13.
 */

// 服务端处理完输入消息后，然后反馈一个消息给对方
// 对方可以监听这个消息进行处理
public interface SinkReceiverFeedback {
    String FEEDBACK = "myQueueFeedback";

    @Output(SinkReceiverFeedback.FEEDBACK)
    MessageChannel feedbackOutput();
}
