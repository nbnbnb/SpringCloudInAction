package me.zhangjin.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by ZhangJin on 2018/5/6.
 */

@SpringBootApplication
public class ConfigClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
    }

}
