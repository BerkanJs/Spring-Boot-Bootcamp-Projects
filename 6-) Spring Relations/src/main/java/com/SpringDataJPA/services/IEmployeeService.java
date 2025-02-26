package com.SpringDataJPA.services;

import java.util.List;

import com.SpringDataJPA.dto.DtoEmployee;

public interface IEmployeeService {
	
	public List <DtoEmployee> findAllEmployees();

}
