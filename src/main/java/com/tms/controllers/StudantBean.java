package com.tms.controllers;

import java.util.Date;

import javax.faces.bean.ManagedBean;

import com.tms.constants.StudantGenre;
import com.tms.constants.StudantType;

@ManagedBean
public class StudantBean {
	private Long id;
	private String name;
	private StudantGenre genre;
	private StudantType type;	
	private boolean active = true;
	private boolean readingHighlights;
	private Date lastHighlights;
	private boolean numberOne;
	private Date lastNumberOne;
	private boolean numberTwo;
	private Date lastNumberTwo;
	private boolean numberThree;
	private Date lastNumberThree;
	private boolean helper;
	private Date lastHelper;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudantGenre getGenre() {
		return genre;
	}
	public void setGenre(StudantGenre genre) {
		this.genre = genre;
	}
	public StudantType getType() {
		return type;
	}
	public void setType(StudantType type) {
		this.type = type;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isReadingHighlights() {
		return readingHighlights;
	}
	public void setReadingHighlights(boolean readingHighlights) {
		this.readingHighlights = readingHighlights;
	}
	public Date getLastHighlights() {
		return lastHighlights;
	}
	public void setLastHighlights(Date lastHighlights) {
		this.lastHighlights = lastHighlights;
	}
	public boolean isNumberOne() {
		return numberOne;
	}
	public void setNumberOne(boolean numberOne) {
		this.numberOne = numberOne;
	}
	public Date getLastNumberOne() {
		return lastNumberOne;
	}
	public void setLastNumberOne(Date lastNumberOne) {
		this.lastNumberOne = lastNumberOne;
	}
	public boolean isNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(boolean numberTwo) {
		this.numberTwo = numberTwo;
	}
	public Date getLastNumberTwo() {
		return lastNumberTwo;
	}
	public void setLastNumberTwo(Date lastNumberTwo) {
		this.lastNumberTwo = lastNumberTwo;
	}
	public boolean isNumberThree() {
		return numberThree;
	}
	public void setNumberThree(boolean numberThree) {
		this.numberThree = numberThree;
	}
	public Date getLastNumberThree() {
		return lastNumberThree;
	}
	public void setLastNumberThree(Date lastNumberThree) {
		this.lastNumberThree = lastNumberThree;
	}
	public boolean isHelper() {
		return helper;
	}
	public void setHelper(boolean helper) {
		this.helper = helper;
	}
	public Date getLastHelper() {
		return lastHelper;
	}
	public void setLastHelper(Date lastHelper) {
		this.lastHelper = lastHelper;
	}
	
	
	// Methods
	public StudantGenre[] getStudantGenres() {
		return StudantGenre.values();
	}
	
	public StudantType[] getStudantTypes() {
		return StudantType.values();
	}
	
	public String convertEnumStudantTypes(StudantType type){
		switch (type.toString()) {
			case "PUBLISHER":
				return "Publicador";
			
			case "MINISTERIAL_SERVANT":
				return "Servo Ministerial";
			
			case "ELDER":
				return "Ancião";
			
			default:
				break;
		}
		
		return null;
	}
	
}
