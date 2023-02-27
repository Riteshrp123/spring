package com.xworkz.ornaments.repo;

import java.util.List;

import com.xworkz.ornaments.dto.OrnamentsDto;

public interface OrnamentsRepo {

   public boolean save(OrnamentsDto dto);
	
	public List<OrnamentsDto> read();
	
	public OrnamentsDto findNameByType(String name,String type);
	
	public boolean updateNameById(String name,int id);
	
	public boolean deleteById(int id);
}
