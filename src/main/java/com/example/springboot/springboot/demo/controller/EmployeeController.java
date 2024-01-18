package com.example.springboot.springboot.demo.controller;

import com.example.springboot.springboot.demo.model.Employee;
import com.example.springboot.springboot.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
@PostMapping("/add")
public Employee createEmployee(@RequestBody Employee employee){
return employeeService.createEmployee(employee);
}

@GetMapping("/getemployee")
public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
}

@GetMapping("/{id}")
    public Employee getById(@PathVariable Long id){
        return employeeService.getById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        return employeeService.update(id,employee);
    }

    @DeleteMapping("/delete/{id}")

    public void deleteEmployee(@PathVariable Long id){
        employeeService.delete(id);
    }



}
