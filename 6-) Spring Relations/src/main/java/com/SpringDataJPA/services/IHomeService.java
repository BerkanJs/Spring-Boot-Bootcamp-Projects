package com.SpringDataJPA.services;

import com.SpringDataJPA.dto.DtoHome;

public interface IHomeService {
	
	
	public DtoHome findHomeByID(Long id);

}
