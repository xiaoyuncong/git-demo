package com.example.demo.excel;

import com.example.demo.excel.UserData;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author：xiaoYuncong
 * @Version：1.0
 * @Date：2023/12/16-14:27
 * @Since：jdk1.8
 * @Description：
 */
@Mapper
public interface SimpleBeanMapper {

    void insert( UserData userData);
}
