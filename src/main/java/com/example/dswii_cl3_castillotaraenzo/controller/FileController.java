package com.example.dswii_cl3_castillotaraenzo.controller;

import com.example.dswii_cl3_castillotaraenzo.model.response.ResponseFile;
import com.example.dswii_cl3_castillotaraenzo.service.FileService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/file")
public class FileController {
    private FileService fileService;
    @PostMapping("/upload")
    public ResponseEntity<ResponseFile> subirArchivos(
            @RequestParam("files")List<MultipartFile> files) throws  Exception{
        fileService.guardarArchivos(files);
        return ResponseEntity.status(HttpStatus.OK)
                .body(
                        ResponseFile.builder().message("Los archivos fueron cargados correctamente")
                                .build()
                );
    }
}