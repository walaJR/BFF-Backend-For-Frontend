package com.banklegacy.bfftransactions.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.banklegacy.bfftransactions.dto.TransaccionBffDto;
import com.banklegacy.bfftransactions.entity.Transacciones;

@Service
public interface BffService {

    // Método para endpoint que muestre todos los registros de la tabla
    List<Transacciones> getAll();

    // Endpoint "mobile version" que devuelve menos columnas y sólo 150 registros ,
    // en lugar de 1000
    List<TransaccionBffDto> getAllMobileVersion();

}