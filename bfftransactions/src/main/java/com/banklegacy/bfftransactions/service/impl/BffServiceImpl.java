package com.banklegacy.bfftransactions.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.banklegacy.bfftransactions.dto.TransaccionBffDto;
import com.banklegacy.bfftransactions.entity.Transacciones;
import com.banklegacy.bfftransactions.restclient.ClienteRest;
import com.banklegacy.bfftransactions.service.BffService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BffServiceImpl implements BffService {

    private final ClienteRest clienteRest;

    // Constante para el límite de registros mobile
    private static final int MOBILE_LIMIT = 150;

    @Override
    public List<Transacciones> getAll() {
        return clienteRest.getAll();
    }

    @Override
    public List<TransaccionBffDto> getAllMobileVersion() {
        List<Transacciones> transaccionesCompletas = clienteRest.getAll();

        // Transformamos eliminando la columna ID y limitamos a 150 registros
        return transaccionesCompletas.stream()
                .limit(MOBILE_LIMIT)
                .map(this::convertToTransaccionBffDto)
                .collect(Collectors.toList());
    }

    private TransaccionBffDto convertToTransaccionBffDto(Transacciones transaccion) {
        return new TransaccionBffDto(
                transaccion.getFecha(),
                transaccion.getMonto(),
                transaccion.getTipo());
    }
}