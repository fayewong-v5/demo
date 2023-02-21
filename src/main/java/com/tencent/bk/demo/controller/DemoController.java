package com.tencent.bk.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class DemoController {
    @RequestMapping("/")
    public String get() {
        return "Hello world";
    }
}
