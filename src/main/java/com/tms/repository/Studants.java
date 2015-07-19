package com.tms.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.tms.model.Studant;

public class Studants implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private EntityManager manager;
	
	public Studants (EntityManager manager){
		this.manager = manager;
	}
	
	// Métodos para inserir estudante no banco de Dados
	public void insertStudant(Studant studant){
		try {
			manager.getTransaction().begin();
			manager.persist(studant);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			manager.close();
		}
	}
	
	public List<Studant> getAll(){
		TypedQuery<Studant> query = manager.createQuery("from Studant", Studant.class);
		return query.getResultList();
	}
}
