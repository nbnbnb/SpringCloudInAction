package me.zhangjin.study.api.service;

import me.zhangjin.study.api.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ZhangJin on 2018/5/6.
 */

@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello6", method = RequestMethod.POST)
    String hello(@RequestBody User user);

}
