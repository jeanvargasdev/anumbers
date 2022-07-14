package com.sistema.alticci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AlticciNumbersApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlticciNumbersApplication.class, args);
	}

}
