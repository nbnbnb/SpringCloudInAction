package me.zhangjin.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ZhangJin on 2018/4/29.
 */
// 通过 @EnableDiscoveryClient 注解让该应用注册为 Eureka 客户端应用
// 以获得服务发现的能力
@EnableDiscoveryClient
// 开启断路器功能
@EnableCircuitBreaker
@SpringBootApplication
public class ConsumerApplication {

    @Bean
    // 通过 @LoadBalanced 注解开启客户端的负载均衡
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
