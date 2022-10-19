package com.sankalp.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/customer")
public class CreateController {
  @Autowired
  CustomerRepository customerRepo;

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public Customer saveCustomer(@RequestBody Customer customer) {
    customer = customerRepo.save(customer);
    return customer;
  }

  @RequestMapping(value = "/read", method = RequestMethod.GET)
  public List<Customer> readCustomer() {
    return customerRepo.findAll();
  }

  @RequestMapping(value = "/update", method = RequestMethod.PUT)
  public void modifyByPatientName(@RequestParam String doctorName, @RequestParam String patientName) {
    Customer customer = customerRepo.findByPatientName(patientName);
    customer.setDoctorName(doctorName);
    customerRepo.save(customer);
  }

  @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
  public void deleteByPatientName(@RequestParam String patientName) {
    customerRepo.deleteByPatientName(patientName);
  }

  @RequestMapping(value = "/findByName", method = RequestMethod.GET)
  public void findByPatientName(@RequestParam String patientName) {
    customerRepo.findByPatientName(patientName);
  }


}
