package com.SpringDataJPA.services.impl;


import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringDataJPA.dto.DtoAddress;
import com.SpringDataJPA.dto.DtoCustomer;
import com.SpringDataJPA.entitiy.Address;
import com.SpringDataJPA.entitiy.Customer;
import com.SpringDataJPA.repository.CustomerRepository;
import com.SpringDataJPA.services.ICustomerService;


@Service
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired 
   private CustomerRepository customerRepository;

	@Override
	public DtoCustomer findCustomerById(Long id) {
		DtoAddress dtoAddress=new DtoAddress();
		DtoCustomer dtoCustomer=new DtoCustomer();
		Optional<Customer> optional= customerRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		
		
		Customer customer =optional.get();
		Address address = optional.get().getAddress();
		BeanUtils.copyProperties(customer, dtoCustomer);
		BeanUtils.copyProperties(address, dtoAddress);
		
		dtoCustomer.setAddress(dtoAddress);
		
		return dtoCustomer;
		
		
	
	}

}
