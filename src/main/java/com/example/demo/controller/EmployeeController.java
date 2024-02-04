package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<Employee> getEmployeeWithId(@PathVariable String id)
    {
       Employee emp = employeeService.findEmployeeById(Long.parseLong(id)).get();
       return ResponseEntity.ok(emp);
    }

    @PostMapping("/postEmployee")
    public ResponseEntity<Object> postEmployeeWithId(Employee employee)
    {
        employeeService.addEmployee(employee);
        return ResponseEntity.ok().build();
    }
}
