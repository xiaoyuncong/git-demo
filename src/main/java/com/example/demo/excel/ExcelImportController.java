package com.example.demo.excel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ExcelImportController {

    @Autowired
    private ExcelImportService excelImportService;

    @PostMapping("/importExcel")
    public String importExcel(@RequestParam("file") MultipartFile file) {
        // 获取上传的Excel文件
        String excelFilePath = "/path/to/uploaded/file.xlsx";
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 创建一个空的列表，用于存放Excel数据
        List<UserData> dataList = new ArrayList<>();

        // 调用Excel导入服务
        excelImportService.importExcelData(inputStream, dataList);

        return "Excel导入成功";
    }
}
