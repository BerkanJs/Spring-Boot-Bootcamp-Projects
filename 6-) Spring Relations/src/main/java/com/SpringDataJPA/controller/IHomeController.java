package com.SpringDataJPA.controller;

import com.SpringDataJPA.dto.DtoHome;

public interface IHomeController {
	
	public DtoHome findHomeById(Long id);

}
