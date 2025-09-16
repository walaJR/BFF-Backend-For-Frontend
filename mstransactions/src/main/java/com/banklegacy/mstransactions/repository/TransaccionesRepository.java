package com.banklegacy.mstransactions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banklegacy.mstransactions.entity.Transacciones;

@Repository
public interface TransaccionesRepository extends JpaRepository<Transacciones, Long> {

}