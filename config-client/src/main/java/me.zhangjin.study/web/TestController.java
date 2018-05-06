package me.zhangjin.study.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhangJin on 2018/5/7.
 */

@RefreshScope
@RestController
public class TestController {

    // 使用 Environment 方式进行注入
    @Autowired
    private Environment environment;

    // 使用 @Value 注解进行注入
    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from() {
        return this.from + "-" + environment.getProperty("from", "undefined");
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }
}
