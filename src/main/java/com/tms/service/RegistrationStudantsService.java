package com.tms.service;

import java.io.Serializable;

import javax.inject.Inject;
import com.tms.model.Studant;
import com.tms.repository.Studants;
import com.tms.util.Transacional;

public class RegistrationStudantsService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Studants studants;
	
	@Transacional
	public void salvar(Studant studant) {
		studants.guardar(studant);
	}
	
	@Transacional
	public void excluir(Studant studant) {
		studants.remover(studant);
	}
}
