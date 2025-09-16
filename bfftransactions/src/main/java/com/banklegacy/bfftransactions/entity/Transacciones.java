package com.banklegacy.bfftransactions.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transacciones {

    private Long id;
    private LocalDate fecha;
    private BigDecimal monto;
    private String tipo;

}