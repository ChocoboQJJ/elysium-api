package com.elysium.elysiumapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author AdeleNaumann
 */
@SpringBootApplication
@MapperScan("com.elysium.elysiumapi.mapper")
public class ElysiumApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElysiumApiApplication.class, args);
    }

}
