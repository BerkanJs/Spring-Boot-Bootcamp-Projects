package com.SpringDataJPA.controller;

import com.SpringDataJPA.dto.DtoAddress;

public interface IAddressController {
	
	public DtoAddress findAddressById(Long id);
	

}
