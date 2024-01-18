package com.example.springboot.springboot.demo.service;

import com.example.springboot.springboot.demo.model.Employee;
import com.example.springboot.springboot.demo.repository.EmployeeRepository;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService  {

    private EmployeeRepository employeeRepository;
public EmployeeService(EmployeeRepository employeeRepository){

    this.employeeRepository=employeeRepository;
}

    public Employee createEmployee(Employee employee){

    return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
    return employeeRepository.findAll();
    }

    public Employee getById(Long id){
return employeeRepository.findById(id).orElse(null);
    }
//public Employee update( Long id, Employee employee){
//employee.setId(id);
//return employeeRepository.save(employee);
//
//    }
    public Employee update(Long id, Employee employee) {
        employee.setId(id);
        return employeeRepository.save(employee);
    }

    public void delete(Long id){
     employeeRepository.deleteById(id);
    }

}
