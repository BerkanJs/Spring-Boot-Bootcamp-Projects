package com.SpringDataJPA.controller;

import com.SpringDataJPA.dto.DtoCustomer;

public interface ICustomerController {
	
	public DtoCustomer findCustomerById(Long id);

}
