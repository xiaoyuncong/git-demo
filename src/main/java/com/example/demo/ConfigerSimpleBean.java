package com.example.demo;

import com.example.demo.excel.UserData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author：xiaoYuncong
 * @Version：1.0
 * @Date：2023/10/22-14:15
 * @Since：jdk1.8
 * @Description：
 */
@Configuration
public class ConfigerSimpleBean {

    @Bean
    public UserData simpleBean(){

        return new UserData();
    }
}
