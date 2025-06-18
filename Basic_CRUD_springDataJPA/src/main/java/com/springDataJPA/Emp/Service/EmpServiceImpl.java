package com.springDataJPA.Emp.Service;

import com.springDataJPA.Emp.Emp;
import com.springDataJPA.Emp.Repo.empRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    private final empRep rep;

    public EmpServiceImpl(empRep rep) {
        this.rep = rep;
    }

    @Override
    public Emp createEmp(Emp emp) {
        return rep.save(emp);
    }

    @Override
    public Emp updateEmp(Integer id, Emp emp) {
        Emp e=rep.findById(id).orElseThrow();
        e.setEmpName(emp.getEmpName());
        e.setCity(emp.getCity());
        e.setNumber(emp.getNumber());
        return rep.save(e);
    }

    @Override
    public Emp getEmpById(Integer id) {
        return rep.findById(id).orElse(null);
    }

    @Override
    public List<Emp> allEmp() {
        return rep.findAll();
    }

    @Override
    public void deleteUser(Integer id) {
rep.deleteById(id);
    }
}
