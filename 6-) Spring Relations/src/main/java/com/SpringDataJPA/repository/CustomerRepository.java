package com.SpringDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringDataJPA.entitiy.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
