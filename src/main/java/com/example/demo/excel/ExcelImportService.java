package com.example.demo.excel;

import com.alibaba.excel.EasyExcel;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class ExcelImportService {

    public void importExcelData(InputStream excelFilePath, List<UserData> dataList) {
        EasyExcel.read(excelFilePath, UserData.class, new UserDataListener(dataList)).sheet().doRead();
    }
}
