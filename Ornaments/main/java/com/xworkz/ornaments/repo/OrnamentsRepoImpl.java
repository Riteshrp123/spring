package com.xworkz.ornaments.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.xworkz.ornaments.dto.OrnamentsDto;
@Component
public class OrnamentsRepoImpl implements OrnamentsRepo {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ornamentsdata");
	private EntityManager em = emf.createEntityManager();
	
	@Override
	public boolean save(OrnamentsDto dto) {
		if(em!=null) {
			System.out.println("data save sucessfully");
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public List<OrnamentsDto> read() {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("read", OrnamentsDto.class);
			em.getTransaction().commit();
			return query.getResultList();
		}
		return null;
	}

	@Override
	public OrnamentsDto findNameByType(String name,String type) {
		if(em!=null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findNameByType",OrnamentsDto.class);
			query.setParameter("nm", name);
			query.setParameter("ty", type);
			em.getTransaction().commit();
			return (OrnamentsDto) query.getSingleResult();
			
		}
		return null;
	}

	@Override
	public boolean updateNameById(String name, int id) {
	if(em!=null) {
		em.getTransaction().begin();
	Query query = em.createNamedQuery("updateNameById");
	query.setParameter("nm", name);
	query.setParameter("id", id);
	query.executeUpdate();
	em.getTransaction().commit();
	return true;
	}
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		if(em!=null) {
			em.getTransaction().begin();
		Query query = em.createNamedQuery("deleteById");
		query.setParameter("id", id);
		query.executeUpdate();
		em.getTransaction().commit();
		return true;	
		}
		return false;
	}

}
