package com.example.demo.service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> findEmployeeById(Long id)
    {
        return employeeRepository.findById(id);
    }

    public void addEmployee(Employee employee) {
        System.out.println("In Employee");
        employeeRepository.save(employee);
    }
}
