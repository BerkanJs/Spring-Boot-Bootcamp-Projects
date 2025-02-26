package com.SpringDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringDataJPA.entitiy.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {

}
