package com.SpringDataJPA.services;

import com.SpringDataJPA.dto.DtoAddress;

public interface IAddressService {
	
	public DtoAddress findAddressById(Long id);

}
