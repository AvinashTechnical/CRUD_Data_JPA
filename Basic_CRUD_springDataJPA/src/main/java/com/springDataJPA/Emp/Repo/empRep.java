package com.springDataJPA.Emp.Repo;

import com.springDataJPA.Emp.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empRep extends JpaRepository<Emp,Integer> {
}
