package com.SpringDataJPA.controller;

import java.util.List;

import com.SpringDataJPA.dto.DtoEmployee;

public interface IEmployeeController {
	public List<DtoEmployee> findAllEmployees();

}
