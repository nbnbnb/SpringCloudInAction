package me.zhangjin.study;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * Created by ZhangJin on 2018/5/6.
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignConsumerApplication {

    /**
     * Feign 客户端默认的 Logger.Level 对象定义为 NONE 级别，该级别不会记录任何 Feign 调用过程中的信息'
     * 所以我们需要调整它的级别，针对全局的日志级别，可以在应用主类中直接添加 Logger.Level 的 Bean 创建
     *
     * 同时，要在  application.properties 文件中，设置 logging.level.<FeignClient>=DEBUG
     * <FeignClient> 为客户端接口的完整路径
     * @return
     */
    @Bean
    Logger.Level feginLoggerLevel() {
        return Logger.Level.FULL;
    }

    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication.class, args);
    }

}
