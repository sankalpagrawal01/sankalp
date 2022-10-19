package com.sankalp.app.controller;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByPatientName(String patientName);

    public void deleteByPatientName(String patientName);
    public Customer save(Customer customer);

}
