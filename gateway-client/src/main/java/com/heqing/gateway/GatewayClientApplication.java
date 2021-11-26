package com.heqing.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author heqing
 * @date 2021/11/26 11:49
 */
@SpringBootApplication
public class GatewayClientApplication {

    public static void main(String[] args) {
        new SpringApplication(GatewayClientApplication.class).run(args);
    }
}
