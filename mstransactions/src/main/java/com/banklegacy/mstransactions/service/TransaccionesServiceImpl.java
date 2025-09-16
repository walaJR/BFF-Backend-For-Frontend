package com.banklegacy.mstransactions.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.banklegacy.mstransactions.entity.Transacciones;
import com.banklegacy.mstransactions.repository.TransaccionesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransaccionesServiceImpl implements TransaccionesService {

    private final TransaccionesRepository transaccionesRepository;

    @Override
    public List<Transacciones> getAllTransactions() {
        return transaccionesRepository.findAll();

    }

}