package dev.jhordycg.ecomarket_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.jhordycg.ecomarket_api.model.House;

@Repository
public interface HouseRepository extends MongoRepository<House, String> {
}