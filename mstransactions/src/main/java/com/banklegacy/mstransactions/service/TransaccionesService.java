package com.banklegacy.mstransactions.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.banklegacy.mstransactions.entity.Transacciones;

@Service
public interface TransaccionesService {

    List<Transacciones> getAllTransactions();

}