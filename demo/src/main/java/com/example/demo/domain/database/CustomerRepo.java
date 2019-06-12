package com.example.demo.domain.database;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
