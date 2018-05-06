package me.zhangjin.study.web;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ZhangJin on 2018/5/6.
 */

// 实现 Feign 中 Hystrix 的服务降级回调
@Component
public class HelloServiceFallback implements HelloService {
    public String hello() {
        return "error";
    }

    public String hello(@RequestParam("name") String name) {
        return null;
    }

    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User("未知", 0);
    }

    public String hello(@RequestBody User user) {
        return "error";
    }
}
