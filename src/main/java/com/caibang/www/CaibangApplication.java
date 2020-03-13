package com.caibang.www;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan({"com.caibang.www.*.mapper"})
public class CaibangApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaibangApplication.class, args);
    }

}
