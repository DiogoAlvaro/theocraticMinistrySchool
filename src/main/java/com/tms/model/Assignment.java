package com.tms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tms.constants.AssignmentLocal;
import com.tms.constants.AssignmentType;

@Entity
@Table(name="meeting")
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
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(nullable=false)
	public AssignmentType getType() {
		return type;
	}
	public void setType(AssignmentType type) {
		this.type = type;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn(nullable=false)
	public Studant getStudant() {
		return studant;
	}
	public void setStudant(Studant studant) {
		this.studant = studant;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn(nullable=false)	
	public Studant getHelper() {
		return helper;
	}
	public void setHelper(Studant helper) {
		this.helper = helper;
	}
	
	@JoinColumn(nullable=false)	
	public String getSourceMatters() {
		return sourceMatters;
	}
	public void setSourceMatters(String sourceMatters) {
		this.sourceMatters = sourceMatters;
	}
	
	@JoinColumn(nullable=false)	
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	@JoinColumn(nullable=false)	
	public short getScene() {
		return Scene;
	}
	public void setScene(short scene) {
		Scene = scene;
	}
	
	@JoinColumn(nullable=false)	
	public AssignmentLocal getLocal() {
		return local;
	}
	public void setLocal(AssignmentLocal local) {
		this.local = local;
	}
	
	@JoinColumn(nullable=false)	
	public short getStudyNumber() {
		return StudyNumber;
	}
	public void setStudyNumber(short studyNumber) {
		StudyNumber = studyNumber;
	}
	
	
}
