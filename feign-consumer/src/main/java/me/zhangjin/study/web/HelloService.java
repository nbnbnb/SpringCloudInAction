package me.zhangjin.study.web;

/**
 * Created by ZhangJin on 2018/5/6.
 */

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

// 获取 Eureka 中的服务列表
// 然后映射到指定的服务
// 与 Ribbon 相比，减少了通过 RestTemplate 这个中间过程
// Feign 实现的消费者，依然是利用 Ribbon 维护了针对 HELLO-SERVICE 的服务列表信息，并且通过轮询实现了客户端负载均衡
@FeignClient("hello-service")
public interface HelloService {
    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);


    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);


    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);

}
