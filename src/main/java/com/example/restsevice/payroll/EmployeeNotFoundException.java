package com.example.restsevice.payroll;

public class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException (Long id) {
        super("Could not find employee " + id);
    }
}
