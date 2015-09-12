package com.tms.constants;

public enum StudantGenre {
	MALE("Masculino"), 
	FEMALE("Feminino");
	
	private String description;

	private StudantGenre(String description) {
		this.description = description;
	}

	public String getdescription() {
		return description;
	}
	
}
