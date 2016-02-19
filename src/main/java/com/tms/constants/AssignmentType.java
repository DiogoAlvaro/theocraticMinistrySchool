package com.tms.constants;

public enum AssignmentType {
	DISCOURSE("Discurso"),
	FIND_SPIRITUAL_JEWELS("Encontre Jóias Espirituais"),
	BIBLE_READING("Leitura da Bíblia"), 
	FIRST_VISIT("Primeira Visita"),
	REVISIT("Revisita"),
	BIBLE_STUDY("Estudo Bíblico");
	
	private String description;

	private AssignmentType(String description) {
		this.description = description;
	}

	public String getdescription() {
		return description;
	}
}
