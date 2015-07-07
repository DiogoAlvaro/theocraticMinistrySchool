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
	public boolean getReadingHighlights() {
		return readingHighlights;
	}
	public void setReadingHighlights(boolean readingHighlights) {
		this.readingHighlights = readingHighlights;
	}

	@Temporal(TemporalType.DATE)
	@Column
	public Date getLastHighlights() {
		return lastHighlights;
	}
	public void setLastHighlights(Date lastHighlights) {
		this.lastHighlights = lastHighlights;
	}
	
	@Column(nullable=false)
	public boolean getNumberOne() {
		return numberOne;
	}
	public void setNumberOne(boolean numberOne) {
		this.numberOne = numberOne;
	}
	
	@Temporal(TemporalType.DATE)
	@Column
	public Date getLastNumberOne() {
		return lastNumberOne;
	}
	public void setLastNumberOne(Date lastNumberOne) {
		this.lastNumberOne = lastNumberOne;
	}
	
	@Column(nullable=false)
	public boolean getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(boolean numberTwo) {
		this.numberTwo = numberTwo;
	}
	
	@Temporal(TemporalType.DATE)
	@Column
	public Date getLastNumberTwo() {
		return lastNumberTwo;
	}
	public void setLastNumberTwo(Date lastNumberTwo) {
		this.lastNumberTwo = lastNumberTwo;
	}
	
	@Column(nullable=false)
	public boolean getNumberThree() {
		return numberThree;
	}
	public void setNumberThree(boolean numberThree) {
		this.numberThree = numberThree;
	}
	
	@Temporal(TemporalType.DATE)
	@Column
	public Date getLastNumberThree() {
		return lastNumberThree;
	}
	public void setLastNumberThree(Date lastNumberThree) {
		this.lastNumberThree = lastNumberThree;
	}
	
	@Column(nullable=false)
	public boolean getHelper() {
		return helper;
	}
	public void setHelper(boolean helper) {
		this.helper = helper;
	}
	
	@Temporal(TemporalType.DATE)
	@Column
	public Date getLastHelper() {
		return lastHelper;
	}
	public void setLastHelper(Date lastHelper) {
		this.lastHelper = lastHelper;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
