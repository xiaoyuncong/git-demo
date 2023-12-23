package com.example.demo.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.List;

public class UserDataListener extends AnalysisEventListener<UserData> {

    private List<UserData> dataList;

    public UserDataListener(List<UserData> dataList) {
        this.dataList = dataList;
    }

    @Override
    public void invoke(UserData data, AnalysisContext context) {
        // 数据读取到这里，可以在这里进行处理，比如存放到一个列表中
        dataList.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // 数据读取完毕后的操作，这里可以将数据插入到数据库
        // 这里需要注入UserService或Repository，实现具体的数据库插入操作
        //userService.saveUserDataList(dataList);
    }
}
