package com.example.backend.EmployeeManagement.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    Optional<Employee> findByUsername(String username);
    Optional<Employee> findById(long id);
	List<Employee> findAll();

}