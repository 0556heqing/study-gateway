package com.heqing.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heqing
 * @date 2021/11/26 19:22
 */
@RestController
public class IndexController {

    @GetMapping("/fallback")
    public String fallback() {
        return "服务暂时不可用";
    }
}
