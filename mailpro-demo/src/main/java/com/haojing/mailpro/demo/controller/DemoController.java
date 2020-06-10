package com.haojing.mailpro.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiange
 * @date 2020/6/10 17:35
 */
@RestController
@RequestMapping("/test")
public class DemoController {

    @RequestMapping("/str")
    public String test(){
        return "test";
    }
}
