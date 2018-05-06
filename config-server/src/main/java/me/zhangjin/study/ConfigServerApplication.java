package me.zhangjin.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by ZhangJin on 2018/5/6.
 */

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerApplication.class).web(true).run(args);
    }

}
