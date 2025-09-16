package com.banklegacy.bfftransactions.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.banklegacy.bfftransactions.entity.Transacciones;

@FeignClient(name = "ClienteRest", url = "http://localhost:8080/api/transacciones")
public interface ClienteRest {

    @GetMapping("/getAll")
    List<Transacciones> getAll();

    @GetMapping("/getAllMobileVersion")
    List<Transacciones> getAllMobileVersion();

}