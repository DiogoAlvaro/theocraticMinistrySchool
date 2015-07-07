package com.tms.model;

import java.io.Serializable;

import com.tms.constants.AssignmentLocal;
import com.tms.constants.AssignmentType;

public class Assignment implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private AssignmentType type;
	private Studant studant;
	private Studant helper;
	private String sourceMatters;
	private String theme;
	private short Scene;
	private AssignmentLocal local;
	private short StudyNumber;
	
	
	
}
