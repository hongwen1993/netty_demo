package com.netty.netty_demo01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableScheduling
public class NettyDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(NettyDemo01Application.class, args);
    }

}
