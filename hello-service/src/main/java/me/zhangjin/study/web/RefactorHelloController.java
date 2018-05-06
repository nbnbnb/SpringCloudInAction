package me.zhangjin.study.web;

import me.zhangjin.study.api.dto.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhangJin on 2018/5/6.
 */

/**
 * 通过继承的方式，在 Controller 中不再包含以往会定义的请求映射注解 @RequestMapping
 * 而参数的注解定义在重写的时候会自动带过来
 */

@RestController
public class RefactorHelloController implements me.zhangjin.study.api.service.HelloService {

    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User(name, age);
    }

    public String hello(@RequestBody User user) {
        return "Hello " + user.getName() + " ," + user.getAge();
    }
}
