package com.heqing.gateway.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heqing
 * @date 2021/7/16 16:34
 */
@RestController
@RequestMapping("/gateway")
public class DemoController {


    @RequestMapping("/{str}")
    public String pathVariable(@PathVariable("str") String str) {
        return "hello " + str;
    }
}
