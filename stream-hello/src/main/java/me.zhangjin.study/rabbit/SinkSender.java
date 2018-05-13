package me.zhangjin.study.rabbit;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by ZhangJin on 2018/5/13.
 */

// 这是一个消息发送者
public interface SinkSender {

    // 发送者信道
    // 绑定到 raw-sensor-data 信道上
    @Output("raw-sensor-data")
    MessageChannel output();

}
