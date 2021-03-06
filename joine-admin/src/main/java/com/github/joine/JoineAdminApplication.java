package com.github.joine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author JenphyJohn
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.github.joine.*.mapper")
public class JoineAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(JoineAdminApplication.class, args);
    }
}