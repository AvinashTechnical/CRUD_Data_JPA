package com.springDataJPA.Emp.Service;

import com.springDataJPA.Emp.Emp;

import java.util.List;

public interface EmpService {

    // create the emp....
    Emp createEmp(Emp emp);

    // update the emp.........
    Emp updateEmp(Integer id,Emp emp);

    // get the emp by id.........
    Emp getEmpById(Integer id);

    // get all elements............
    List<Emp> allEmp();

    // delete the elements by id..........
    void deleteUser(Integer id);


}
