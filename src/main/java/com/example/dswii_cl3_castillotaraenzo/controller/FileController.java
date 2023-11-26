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

    @PostMapping("/filespdf")
    public ResponseEntity<ResponseFile> subirArchivosPDF(
            @RequestParam("files") List<MultipartFile> files) throws Exception {
        fileService.guardarArchivosPDF(files);
        return ResponseEntity.status(HttpStatus.OK)
                .body(ResponseFile.builder().message("Los archivos PDF fueron cargados correctamente").build());
    }

    @PostMapping("/filesdoc")
    public ResponseEntity<ResponseFile> subirArchivosDOC(
            @RequestParam("files") List<MultipartFile> files) throws Exception {
        fileService.guardarArchivosDOC(files);
        return ResponseEntity.status(HttpStatus.OK)
                .body(ResponseFile.builder().message("Los archivos DOC fueron cargados correctamente").build());
    }

}