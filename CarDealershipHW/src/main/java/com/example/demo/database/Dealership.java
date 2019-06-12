package com.example.demo.database;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Dealership extends CrudRepository<Car, Long> {
    List<Car> findByYear(Integer year);
    List<Car> findByMake(String make);
    List<Car> findByModel(String model);
    List<Car> findByColor(String color);
}
