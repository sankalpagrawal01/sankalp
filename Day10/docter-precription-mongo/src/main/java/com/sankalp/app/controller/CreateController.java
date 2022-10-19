package com.sankalp.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/precription")
public class CreateController {
  @Autowired
  PrecriptionRepository precriptionRepo;

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public Precription savePrecription(@RequestBody Precription precription) {
    precription = precriptionRepo.save(precription);
    return precription;
  }

  @RequestMapping(value = "/read", method = RequestMethod.GET)
  public List<Precription> readPrecription() {
    return precriptionRepo.findAll();
  }

  @RequestMapping(value = "/update", method = RequestMethod.PUT)
  public void modifyByID(@RequestParam String prescriptionId, @RequestParam String patientName) {
    Precription precription = precriptionRepo.findByName(patientName);
    precription.setPrescriptionId(prescriptionId);
    precriptionRepo.save(precription);
  }

  @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
  public void deleteByID(@RequestParam String prescriptionId) {
    precriptionRepo.deleteByID(prescriptionId);
  }

  @RequestMapping(value = "/findByname", method = RequestMethod.GET)
  public void findByNAME(@RequestParam String patientName) {
    precriptionRepo.findBypatientname(patientName);
  }

}
