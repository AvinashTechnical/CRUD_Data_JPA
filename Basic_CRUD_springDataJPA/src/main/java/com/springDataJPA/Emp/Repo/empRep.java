package com.springDataJPA.Emp.Repo;

import com.springDataJPA.Emp.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface empRep extends JpaRepository<Emp,Integer> {
}
