package com.SpringDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringDataJPA.entitiy.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
