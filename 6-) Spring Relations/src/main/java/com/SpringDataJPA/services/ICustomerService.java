package com.SpringDataJPA.services;

import com.SpringDataJPA.dto.DtoCustomer;

public interface ICustomerService {
	
	public DtoCustomer findCustomerById(Long id);

}
