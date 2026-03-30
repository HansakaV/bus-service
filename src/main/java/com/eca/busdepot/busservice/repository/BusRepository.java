package com.eca.busdepot.busservice.repository;

import com.eca.busdepot.busservice.model.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends MongoRepository<Bus, String> {
}
