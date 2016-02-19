package com.tms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.tms.constants.StudantGenre;
import com.tms.constants.StudantType;

@Entity
@Table(name="studant")
public class Studant implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private StudantGenre genre;
	private StudantType type;	
	private boolean active;
	private boolean dicourse;
	private boolean findSpiritualJewels;
	private boolean bibleReading;
	private boolean firstVisit;
	private boolean revisit;
	private boolean bibleStudy;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(length=120, nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	public StudantGenre getGenre() {
		return genre;
	}
	public void setGenre(StudantGenre genre) {
		this.genre = genre;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	public StudantType getType() {
		return type;
	}
	public void setType(StudantType type) {
		this.type = type;
	}
	
	@Column(nullable=false)
	public boolean getActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Column(nullable=false)
	public boolean isDicourse() {
		return dicourse;
	}
	public void setDicourse(boolean dicourse) {
		this.dicourse = dicourse;
	}
	
	@Column(nullable=false)
	public boolean isFindSpiritualJewels() {
		return findSpiritualJewels;
	}
	public void setFindSpiritualJewels(boolean findSpiritualJewels) {
		this.findSpiritualJewels = findSpiritualJewels;
	}
	
	@Column(nullable=false)
	public boolean isBibleReading() {
		return bibleReading;
	}
	public void setBibleReading(boolean bibleReading) {
		this.bibleReading = bibleReading;
	}
	
	@Column(nullable=false)
	public boolean isFirstVisit() {
		return firstVisit;
	}
	public void setFirstVisit(boolean firstVisit) {
		this.firstVisit = firstVisit;
	}
	
	@Column(nullable=false)
	public boolean isRevisit() {
		return revisit;
	}
	public void setRevisit(boolean revisit) {
		this.revisit = revisit;
	}
	
	@Column(nullable=false)
	public boolean isBibleStudy() {
		return bibleStudy;
	}
	public void setBibleStudy(boolean bibleStudy) {
		this.bibleStudy = bibleStudy;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Studant))
			return false;
		Studant other = (Studant) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
