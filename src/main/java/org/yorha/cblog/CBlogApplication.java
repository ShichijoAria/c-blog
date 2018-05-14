package org.yorha.cblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.yorha.cblog.dao")
@SpringBootApplication
public class CBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(CBlogApplication.class, args);
    }
}
