package com.SpringDataJPA.services.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringDataJPA.dto.DtoHome;
import com.SpringDataJPA.dto.DtoRoom;
import com.SpringDataJPA.entitiy.Home;
import com.SpringDataJPA.entitiy.Room;
import com.SpringDataJPA.repository.HomeRepository;
import com.SpringDataJPA.services.IHomeService;

@Service
public class HomeServiceImpl  implements IHomeService{
	
	@Autowired
	private HomeRepository homeRepository;

	@Override
	public DtoHome findHomeByID(Long id) {
		DtoHome dtoHome =new DtoHome();
		Optional<Home> optional=homeRepository.findById(id);
		if(optional.isEmpty()) {
			
			return null;
		}
		
		
		
		
	     Home dbHome = optional.get();
	     List<Room> dbRooms=optional.get().getRoom();
	     BeanUtils.copyProperties(dbHome, dtoHome);
	     if(dbRooms!=null && !dbRooms.isEmpty()) {
	    	 for(Room room : dbRooms) {
	    		 DtoRoom dtoRoom = new DtoRoom();
	    		 dtoHome.getRooms().add(dtoRoom);
	    	 }
	     }
	     return dtoHome;
	}
	
	

}
