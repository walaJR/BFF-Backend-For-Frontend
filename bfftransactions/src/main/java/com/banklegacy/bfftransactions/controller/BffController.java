package com.banklegacy.bfftransactions.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banklegacy.bfftransactions.dto.TransaccionBffDto;
import com.banklegacy.bfftransactions.entity.Transacciones;
import com.banklegacy.bfftransactions.service.BffService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/bff")
public class BffController {

    private final BffService bffService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Transacciones>> getAll() {
        return ResponseEntity.ok(bffService.getAll());
    }

    @GetMapping("/getAllMobileVersion")
    public ResponseEntity<List<TransaccionBffDto>> getAllMobileVersion() {
        return ResponseEntity.ok(bffService.getAllMobileVersion());
    }

}