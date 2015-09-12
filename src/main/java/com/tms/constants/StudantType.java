package com.tms.constants;

public enum StudantType {
	PUBLISHER("Publicador"), 
	MINISTERIAL_SERVANT("Servo Ministerial"),
	ELDER("Ancião");
	
	private String description;

	private StudantType(String description) {
		this.description = description;
	}

	public String getdescription() {
		return description;
	}
	
}
