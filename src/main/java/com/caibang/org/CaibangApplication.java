package com.caibang.org;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.caibang.org.login.dao","com.caibang.org.resource.master.dao"})
public class CaibangApplication {

    public static void main(String[] args) {
        System.out.println("hello caibang");
        SpringApplication.run(CaibangApplication.class, args);
    }

}
