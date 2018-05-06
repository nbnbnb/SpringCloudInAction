package me.zhangjin.study.web;

import me.zhangjin.study.api.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by ZhangJin on 2018/5/6.
 */

// 通过过程的方式，获取服务的信息
// 可以对比 HelloService 那种重复定义的方式
@FeignClient(value = "HELLO-SERVICE")
public interface RefactorHelloService extends HelloService {
}
