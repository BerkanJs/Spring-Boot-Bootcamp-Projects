package com.SpringDataJPA.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringDataJPA.dto.DtoAddress;
import com.SpringDataJPA.dto.DtoCustomer;
import com.SpringDataJPA.entitiy.Address;
import com.SpringDataJPA.repository.AddressRepository;
import com.SpringDataJPA.services.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService{
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public DtoAddress findAddressById(Long id) {
		DtoAddress dtoAddress = new DtoAddress();
		DtoCustomer dtoCustomer=new DtoCustomer();
		
	Optional<Address> optional=	addressRepository.findById(id);
	if(optional.isEmpty()) {
		return null;
	}
		
		Address address = optional.get();
		BeanUtils.copyProperties(address, dtoAddress);
		dtoCustomer.setId(address.getCustomer().getId());
		dtoCustomer.setName(address.getCustomer().getName());
		//dtoCustomer.setAddress(dtoAddress);
		dtoAddress.setCustomer(dtoCustomer);
		return dtoAddress;
		
	}
	
	
	

}
