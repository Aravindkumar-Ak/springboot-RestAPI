package com.example.springboot.springboot.demo.repository;

import com.example.springboot.springboot.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
