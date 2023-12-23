package com.example.demo;

import com.example.demo.excel.SimpleBeanMapper;
import com.example.demo.excel.UserData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author：xiaoYuncong
 * @Version：1.0
 * @Date：2023/12/16-14:41
 * @Since：jdk1.8
 * @Description：
 */
@SpringBootTest
public class Mappertest {
    @Autowired
    SimpleBeanMapper simpleBeanMapper;

    @Test
    public void test1(){
        UserData userData = new UserData();
        userData.setName("xiao");
        userData.setAge("15");
        simpleBeanMapper.insert(userData);
    }
}
