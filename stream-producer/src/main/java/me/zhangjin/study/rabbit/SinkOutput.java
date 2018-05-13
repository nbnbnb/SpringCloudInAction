package me.zhangjin.study.rabbit;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by ZhangJin on 2018/5/13.
 */
public interface SinkOutput {

    String OUTPUT = "myQueue";

    @Output(SinkOutput.OUTPUT)
    MessageChannel output();
}
