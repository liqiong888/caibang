package com.caibang.www;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan({"com.caibang.www.*.mapper","com.caibang.www.core.*.mapper"})
@ServletComponentScan
public class CaibangApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaibangApplication.class, args);
    }

}
