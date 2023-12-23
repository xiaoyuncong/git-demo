package com.example.demo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Author：xiaoYuncong
 * @Version：1.0
 * @Date：2023/10/22-14:04
 * @Since：jdk1.8
 * @Description：
 */
@Data
//@EnableConfigurationProperties
//@ConfigurationProperties(prefix = "test")
public class UserData {
    private String id;
    @ExcelProperty("name")
    private String name;
    @ExcelProperty("age")
    private String age;
}
