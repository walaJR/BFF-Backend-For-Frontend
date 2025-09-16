package com.banklegacy.mstransactions.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banklegacy.mstransactions.entity.Transacciones;
import com.banklegacy.mstransactions.service.TransaccionesService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/api/transacciones")
public class TransaccionesController {

    private final TransaccionesService transaccionesService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Transacciones>> getAllTransactions() {
        return ResponseEntity.ok(transaccionesService.getAllTransactions());
    }

}