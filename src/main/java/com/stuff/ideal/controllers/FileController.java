package com.stuff.ideal.controllers;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.FileSystemResource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


@Controller
public class FileController {

//    private static final String DOWNLOAD_DIR = "C:/test/";
    private static final String DOWNLOAD_DIR = "/rates/";

    //Windows
//    @GetMapping("/download/{fileName:.+}")
//    public ResponseEntity<FileSystemResource> downloadFile(@PathVariable String fileName) {
//        try {
//            File file = new File(DOWNLOAD_DIR + fileName);
//
//            if (file.exists()) {
//                HttpHeaders headers = new HttpHeaders();
//                headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getName() + "\"");
//                FileSystemResource resource = new FileSystemResource(file);
//                return ResponseEntity.ok()
//                        .headers(headers)
//                        .contentLength(file.length())
//                        .contentType(MediaType.APPLICATION_OCTET_STREAM)
//                        .body(resource);
//            } else {
//                return ResponseEntity.notFound().build();
//            }
//        } catch (Exception e) {
//            return ResponseEntity.status(500).body(null);
//        }
//    }

//    @PostMapping("/upload")
//    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
//        try {
//            Path filePath = Path.of(UPLOAD_DIR + file.getOriginalFilename());
//            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
//            return ResponseEntity.ok("File uploaded successfully");
//        } catch (IOException e) {
//            return ResponseEntity.status(500).body("Failed to upload file");
//        }
//    }

    //Linux
    @GetMapping("/download/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) {
        try {
            Path filePath = Path.of(DOWNLOAD_DIR + fileName);
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists()) {
                HttpHeaders headers = new HttpHeaders();
                headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"");
                return ResponseEntity.ok()
                        .headers(headers)
                        .contentType(MediaType.APPLICATION_OCTET_STREAM)
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(500).body(null);
        }
    }
}
