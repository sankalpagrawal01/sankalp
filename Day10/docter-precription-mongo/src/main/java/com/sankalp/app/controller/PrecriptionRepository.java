package com.sankalp.app.controller;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PrecriptionRepository extends MongoRepository<Precription, String>{

	public Precription findByName(String patientName);
	public Precription findBypatientname(String custId);
	public void deleteByID(String name);
	public Precription save(Precription precription);

}
