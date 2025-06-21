package com.springDataJPA.Emp.Controller;


import com.springDataJPA.Emp.Emp;
import com.springDataJPA.Emp.Service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("emp/api")
public class empController {

    @Autowired
    private final EmpServiceImpl empService;

    public empController(EmpServiceImpl empService) {
        this.empService = empService;
    }

    @PostMapping
    public ResponseEntity<Emp> createEmp(@RequestBody Emp emp) {
        Emp createdEmp = empService.createEmp(emp);
        return ResponseEntity.status(201).body(createdEmp);  // HTTP 201 Created
    }

    // Update an existing employee by ID
    @PutMapping("/{id}")
    public ResponseEntity<Emp> updateEmp(@PathVariable Integer id, @RequestBody Emp emp) {
        Emp updatedEmp = empService.updateEmp(id, emp);
        return ResponseEntity.ok(updatedEmp);  // HTTP 200 OK
    }

    // Get an employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<Emp> getEmpById(@PathVariable Integer id) {
        Emp emp = empService.getEmpById(id);
        return ResponseEntity.ok(emp);  // HTTP 200 OK
    }

    // Get all employees
    @GetMapping
    public ResponseEntity<List<Emp>> allEmp() {
        List<Emp> empList = empService.allEmp();
        return ResponseEntity.ok(empList);  // HTTP 200 OK
    }

    // Delete an employee by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        empService.deleteUser(id);
        return ResponseEntity.noContent().build();  // HTTP 204 No Content
    }

}
