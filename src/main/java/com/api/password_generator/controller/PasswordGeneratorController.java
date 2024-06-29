package com.api.password_generator.controller;

import com.api.password_generator.dto.RequestDTO;
import com.api.password_generator.dto.ResponseDTO;
import com.api.password_generator.service.PasswordGeneratorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PasswordGeneratorController {

    @Autowired
    private PasswordGeneratorService passwordGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<ResponseDTO> generate(@Valid @RequestBody RequestDTO requestDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(passwordGeneratorService.generate(requestDTO));
    }

}
