package com.banklegacy.bfftransactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BfftransactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BfftransactionsApplication.class, args);
	}

}
