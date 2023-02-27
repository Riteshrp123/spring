package com.xworkz.ornaments.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xworkz.ornaments.dto.OrnamentsDto;
@Component
public interface OrnamentsService {
	
	public boolean save(OrnamentsDto dto);
	
	public List<OrnamentsDto> read();
	
	public OrnamentsDto findNameByType(String name,String type);
	
	public boolean updateNameById(String name,int id);
	
	public boolean deleteById(int id);
	

}
