package com.haojing.mailpro.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jiange
 * @date 2020/6/10 20:01
 */
@ComponentScan(basePackages = {"com.haojing.mailpro.security","com.haojing.mailpro.portal"})
@SpringBootApplication
public class PortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class, args);
    }
}
