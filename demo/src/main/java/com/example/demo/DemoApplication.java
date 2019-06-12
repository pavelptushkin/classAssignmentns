package com.example.demo;

import com.example.demo.domain.database.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.domain.database.CustomerRepo;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepo repo){
        return args -> {
            //save a couple customers
            repo.save(new Customer("Fah", "Priyavada"));
            repo.save(new Customer("Pavlo", "Ptushkin"));
            repo.save(new Customer("Michael", "Chihcheese"));
            repo.save(new Customer("Candace", "Beverly"));
            repo.save(new Customer("Tou", "Yang"));
            repo.save(new Customer("Chris", "Bear"));

            log.info("Customers found with findAll():");
            log.info("---------------------------------");
            for (Customer customer : repo.findAll()){
                log.info(customer.toString());
            }
            log.info("");

            //read an individual customer by ID
            repo.findById(1L)
                    .ifPresent(customer -> {
                        log.info("Customer found with findById(1L):");
                        log.info("---------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });


            log.info("Customer found with findByLastName('Bear'):");
            log.info("--------------------------------------------");
            repo.findByLastName("Bear").forEach(bauer -> {
                log.info(bauer.toString());
            });
        };
    }

}
