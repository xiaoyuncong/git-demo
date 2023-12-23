package com.example.demo.excel;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/api")
public class FileUploadController {

    @PostMapping("/importExcel")
    @ResponseBody
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Please select a file to upload.");
        }

        // 在这里处理文件上传的逻辑
        // 你可以调用Excel导入服务，处理文件内容，并插入到数据库等
        // ...

        return ResponseEntity.ok("File uploaded successfully.");
    }
}