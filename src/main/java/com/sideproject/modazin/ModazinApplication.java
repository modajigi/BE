package com.sideproject.modazin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) // DB 연결 비활성화
public class ModazinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModazinApplication.class, args);
    }

}
