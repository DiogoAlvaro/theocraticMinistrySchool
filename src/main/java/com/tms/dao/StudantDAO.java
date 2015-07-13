package com.tms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tms.model.Studant;

public class StudantDAO {
	
	// Criando a Fábrica de Pesistencia no BD
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("theocraticMinistrySchool");
	EntityManager em = emf.createEntityManager();
	
	// Métodos para inserir estudante no banco de Dados
	public void insertStudant(Studant studant){
		try {
			em.getTransaction().begin();
			em.persist(studant);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			emf.close();
		}
	}
}
