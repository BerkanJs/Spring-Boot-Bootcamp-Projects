package com.SpringDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringDataJPA.entitiy.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
