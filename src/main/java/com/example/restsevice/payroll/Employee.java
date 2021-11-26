package com.example.restsevice.payroll;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Employee {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String role;


    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

}
