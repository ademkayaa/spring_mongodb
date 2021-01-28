package com.example.springmongodb.repository;

import com.example.springmongodb.entity.user;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepository extends MongoRepository<user,String> {
}
