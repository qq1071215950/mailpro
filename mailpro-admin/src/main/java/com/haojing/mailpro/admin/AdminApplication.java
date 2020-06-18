package com.haojing.mailpro.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jiange
 * @date 2020/6/10 17:49
 */
@ComponentScan(basePackages = {"com.haojing.mailpro.admin","com.haojing.mailpro.security"})
@SpringBootApplication
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
