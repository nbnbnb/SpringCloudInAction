package me.zhangjin.study.rabbit;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by ZhangJin on 2018/5/13.
 */
public interface SinkInput {
    String INPUT = "myQueue";

    @Input(SinkInput.INPUT)
    SubscribableChannel input();
}
