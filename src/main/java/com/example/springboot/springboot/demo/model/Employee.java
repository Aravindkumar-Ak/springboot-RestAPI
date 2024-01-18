package com.example.springboot.springboot.demo.model;

import jakarta.persistence.*;
import lombok.*;
//import org.springframework.data.annotation.Id;

@Entity
@Data
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email",nullable = false,unique = true)
    private String email;
}
