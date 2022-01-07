package com.example.springbootmongodb.example12.repository;

import com.example.springbootmongodb.example12.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer> {


}
