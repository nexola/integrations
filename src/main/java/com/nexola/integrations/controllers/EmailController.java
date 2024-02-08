package com.nexola.integrations.controllers;

import com.nexola.integrations.dto.EmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emails")
public class EmailController {

    @PostMapping
    public ResponseEntity<Void> send(@RequestBody EmailDTO dto) {


        return ResponseEntity.noContent().build();
    }
}
