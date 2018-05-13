package me.zhangjin.study;

import me.zhangjin.study.rabbit.SinkSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by ZhangJin on 2018/5/13.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StreamHelloApplication.class)
@WebAppConfiguration
public class SrteamHelloApplicationTest {

    // 此处可以直接注入了
    // 因为框架会自动创建这个实例
    @Autowired
    private SinkSender sinkSender;

    @Test
    public void contextLoads(){
        sinkSender.output().send(MessageBuilder.withPayload("From SinkSender").build());
    }
}
