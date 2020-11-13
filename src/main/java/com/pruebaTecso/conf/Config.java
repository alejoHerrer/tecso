/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaTecso.conf;

import com.pruebaTecso.entitys.Producto;
import com.pruebaTecso.entitys.Proveedor;
import com.pruebaTecso.enums.FranquiciaEnum;
import com.pruebaTecso.repository.ProductoRepository;
import com.pruebaTecso.repository.ProveedorRepository;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author alejo
 */
@Configuration
public class Config {
    
    private static final Logger log = LoggerFactory.getLogger(Config.class);

    @Bean
    public CommandLineRunner demo(ProductoRepository repository, ProveedorRepository proveedorRepository) {
        return (args) -> {
            // save a few customers
            Proveedor p = new Proveedor("Hot Wheels","317626626","Cra 67621 172368127");
            Proveedor p1 = new Proveedor("Warner Bross","80800808","Cra 67621 172368127");
            Proveedor p2 = new Proveedor("Hot Wheels","317626626","Cra 67621 172368127");
            proveedorRepository.save(p);
            proveedorRepository.save(p1);
            proveedorRepository.save(p2);
            repository.save(new Producto("Jack", FranquiciaEnum.DC_COMICS.getCodigo(), 10000.0, p));
            repository.save(new Producto("Hola", FranquiciaEnum.DC_COMICS.getCodigo(), 20000.0, p1));
            repository.save(new Producto("Adios", FranquiciaEnum.DC_COMICS.getCodigo(), 30000.0, p2));

            // fetch all customers
            log.info("Productos found with findAll():");
            log.info("-------------------------------");
            for (Producto product : repository.findAll()) {
                log.info(product.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Optional<Producto> product = repository.findById(1L);
            log.info("--------------------------------");
            log.info(product.toString());
            log.info("");

            // fetch customers by last name
            log.info("--------------------------------------------");
            repository.findByNombre("Hola").forEach(hola -> {
                log.info(hola.toString());
            });
            log.info("");
        };
    }

}
