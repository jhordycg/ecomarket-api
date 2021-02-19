package dev.jhordycg.ecomarket_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.jhordycg.ecomarket_api.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
}