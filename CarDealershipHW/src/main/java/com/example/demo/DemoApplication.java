package com.example.demo;

import com.example.demo.database.Car;
import com.example.demo.database.Dealership;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    public CommandLineRunner CarDealershipHW(Dealership dealership){
        return args -> {
            dealership.save(new Car(1999, "Nissan", "Altima", "Blue"));
            dealership.save(new Car(2005, "Ford", "Mustand", "Black"));
            dealership.save(new Car(2007, "Nissan", "Altima", "Silver"));
            dealership.save(new Car(2008, "Mitsubishi", "Lancer", "Blue"));
            dealership.save(new Car(2012, "Ford", "Explorer", "White"));
            dealership.save(new Car(2004, "Honda", "Civic", "Brown"));
            dealership.save(new Car(2012, "Mercedes", "Benz", "Black"));


            log.info("Cars found with findAll():");
            log.info("____________________________");
            for (Car car : dealership.findAll()){
                log.info(car.toString());
            }

            log.info("Cars found with findByYear(2007)");
            log.info("_________________________________");
            dealership.findByYear(2007).forEach(car -> {
                log.info(car.toString());
            });

            log.info("Cars found with findByMake('Nissan')");
            log.info("_________________________________");
            dealership.findByMake("Nissan").forEach(car -> {
                log.info(car.toString());
            });

            log.info("Cars found with findByModel('Altima')");
            log.info("_________________________________");
            dealership.findByModel("Altima").forEach(car -> {
                log.info(car.toString());
            });

            log.info("Cars found with findByColor('Black')");
            log.info("_________________________________");
            dealership.findByColor("Black").forEach(car -> {
                log.info(car.toString());
            });

        };
    }
}
