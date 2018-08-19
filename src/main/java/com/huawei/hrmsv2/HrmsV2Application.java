package com.huawei.hrmsv2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableTransactionManagement
@MapperScan("com.huawei.hrmsv2.data.dao")
public class HrmsV2Application {

    public static void main(String[] args) {
        SpringApplication.run(HrmsV2Application.class, args);
    }
}
