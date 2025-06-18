package com.springDataJPA.Emp.Controller;


import com.springDataJPA.Emp.Emp;
import com.springDataJPA.Emp.Service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping     // we are create a user..........
    public Emp createEmp(@RequestBody Emp emp){
        return empService.createEmp(emp);
    }

    @PutMapping("/{id}")    // update the emp using id.........
    public Emp updateEmp(@PathVariable Integer id,@RequestBody Emp emp){
        return empService.updateEmp(id,emp);
    }

    @GetMapping("/{id}")   // find the emp by id............
    public Emp getEmpById(@PathVariable Integer id){
        return empService.getEmpById(id);
    }


    @GetMapping       // getting the all emp............
    public List<Emp> allEmp(){
        return empService.allEmp();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        empService.deleteUser(id);
    }

}
