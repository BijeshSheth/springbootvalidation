package com.sheth.springbootvalidation.controller;

import com.sheth.springbootvalidation.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @PostMapping
    public ResponseEntity<String> addEmployee(@Valid @RequestBody Employee employee)
    {
        return ResponseEntity.ok("Employee created successfully");
    }

}

