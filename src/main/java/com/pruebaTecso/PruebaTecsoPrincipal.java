package com.pruebaTecso;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class PruebaTecsoPrincipal {

    public static void main(String[] args) {
        SpringApplication.run(PruebaTecsoPrincipal.class, args);
    }

}