package com.tms.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.tms.model.Studant;

public class Studants implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private EntityManager manager;
	
	public Studant porId(Long id) {
		return manager.find(Studant.class, id);
	}
	
	public List<Studant> todos() {
		return manager.createQuery("from Studant", Studant.class).getResultList();
	}
	
	public Studant guardar(Studant studant) {
		return manager.merge(studant);
	}
	
	public void remover(Studant studant) {
		studant = porId(studant.getId());
		manager.remove(studant);
	}
	
	/*
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
	*/
}
