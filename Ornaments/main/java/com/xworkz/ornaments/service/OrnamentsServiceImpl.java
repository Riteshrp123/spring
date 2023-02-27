package com.xworkz.ornaments.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xworkz.ornaments.dto.OrnamentsDto;
import com.xworkz.ornaments.repo.OrnamentsRepo;
import com.xworkz.ornaments.repo.OrnamentsRepoImpl;

@Component
public class OrnamentsServiceImpl implements OrnamentsService {
	
	OrnamentsRepo repo = new OrnamentsRepoImpl();

	@Override
	public boolean save(OrnamentsDto dto) {
		if(dto!=null) {
			if(dto.getName().length()>3){
				System.out.println("data send to repo");
				repo.save(dto);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<OrnamentsDto> read() {
		return repo.read();
	}

	@Override
	public OrnamentsDto findNameByType(String name,String type) {
		if(name!=null && name.length()>3) {
			if(type!=null && type.length()>3) {
				return repo.findNameByType(name, type);
			}
		}
		return null;
	}

	@Override
	public boolean updateNameById(String name, int id) {
		if(name!=null && name.length()>3) {
			if(id>0) {
				return repo.updateNameById(name, id);
			}
		}
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		if(id>0) {
			return repo.deleteById(id);
		}
		return false;
	}

}
